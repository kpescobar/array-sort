package edu.cnm.deepdive.arraysort;
/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Kelly Escobar
 *
 */
public class FinalExam {

  private static final String FINAL_BUNDLE = "resources/test-input.dat";
  private static int[][] list = null;
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    
   

  }
  
  private static LinkedList<float[]> fileReader(String FINAL_BUNDLE) {
    try (
         FileInputStream stream = new FileInputStream(FINAL_BUNDLE);
         InputStreamReader input = new InputStreamReader(stream);
         BufferedReader reader = new BufferedReader(input); 
    ) {
      String line;
      LinkedList<float[]> sorted = new LinkedList<>();
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (line.length() > 0) {
          sorted.add(Integer.parseInt(line));
        }
      }
      return results;
    } catch (IOException ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex);
    }
  }

}
