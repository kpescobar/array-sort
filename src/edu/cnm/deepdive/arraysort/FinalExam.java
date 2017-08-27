package edu.cnm.deepdive.arraysort;
/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kelly Escobar
 *
 */
public class FinalExam {
  

  private static final String FINAL_BUNDLE = "resources/test-input.dat";
  private static Comparator compare = new CompareArray();
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    InputReader inputReader = new InputReader(FINAL_BUNDLE);
    Float[][] temp = inputReader.list;
    System.out.println(Arrays.toString(inputReader.list[0]));
    
    for (Float[] mix : temp) {
     // Collections.shuffle(Arrays.asList(mix));
      Collections.sort(Arrays.asList(mix));
    }
    Arrays.asList(temp).sort(compare);
    System.out.println(Arrays.toString(temp[0]));
    System.out.println(Arrays.toString(temp[1]));
    System.out.println(Arrays.toString(temp[433]));
    System.out.println(Arrays.toString(temp[455]));
  }
  
  private static void writeNeedlesFound(
      String filename, List<Integer> found) {
    try (
      FileOutputStream stream = new FileOutputStream(filename);
      OutputStreamWriter writer = new OutputStreamWriter(stream);
      PrintWriter printer = new PrintWriter(writer);
    ) {
      for (int needle : found) {
        printer.println(needle);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex);
    }
  }

  
   

}
