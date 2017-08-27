/**
 * 
 */
package edu.cnm.deepdive.arraysort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Kelly Escobar
 *
 */
public class CompareArray implements Comparator {

  @Override
  public int compare(Object arrayOne, Object arrayTwo) {
    
    if ((Collections.min(Arrays.asList((Float[])arrayOne)) < 
        (Collections.min(Arrays.asList((Float[])arrayTwo))))) {
      return -1;
    } else if (( Collections.min(Arrays.asList((Float[])arrayOne)) > 
              (Collections.min(Arrays.asList((Float[])arrayTwo))))) {
      return 1;
    } else {
      return 0;
    }
  }

}
