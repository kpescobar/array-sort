package edu.cnm.deepdive.arraysort;
/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Kelly Escobar
 *
 */
public class FinalExam {
  

  private static final String FINAL_BUNDLE = "resources/test-input.dat";
  
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    InputReader inputReader = new InputReader(FINAL_BUNDLE);
    Float[][] temp = inputReader.list;
    System.out.println(Arrays.toString(inputReader.list[0]));
    
    for (Float[] mix : temp) {
      Collections.shuffle(Arrays.asList(mix));
    }
    System.out.println(Arrays.toString(temp[0]));
  }
  
   

}
