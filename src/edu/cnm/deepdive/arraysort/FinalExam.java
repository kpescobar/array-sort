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
 * This is the main class that uses the
 * InputReader class to read the given file and
 * shuffle/sort through each given array in the
 * file.
 */
public class FinalExam {

  private static final String OUTPUT_FILE = "resources/test-output.dat";

  private static final String FINAL_BUNDLE = "resources/test-input.dat";
  private static Comparator compare = new CompareArray();

  /**
   * Shuffles the given arrays, sorts by lowest value
   * and writes each array to an output file.
   * @param args
   */
  public static void main(String[] args) {

    InputReader inputReader = new InputReader(FINAL_BUNDLE);
    Float[][] temp = inputReader.list;
    System.out.println(Arrays.toString(inputReader.list[0]));

    for (Float[] mix : temp) {
      // Collections.sort(Arrays.asList(mix));
      Collections.shuffle(Arrays.asList(mix));
    }
    Arrays.asList(temp).sort(compare);
    writeToOutput(OUTPUT_FILE, temp);
  }

  private static void writeToOutput(String fileName, Float[][] mixed) {

    float counter = 0.0f;
    float sum = 0.0f;

    try (FileOutputStream stream = new FileOutputStream(fileName);
        OutputStreamWriter writer = new OutputStreamWriter(stream);
        PrintWriter printer = new PrintWriter(writer);) {
      for (Float[] writeLine : mixed) {
        int i = 1;
        for (Float num : writeLine) {
          counter++;
          sum += num;
          if (i++ == writeLine.length) {
            printer.printf("%.3f", num);
          } else {
            printer.printf("%.3f|", num);
          }
        }
        printer.println();
      }
      float average = (sum / counter);
      printer.print(average);

    } catch (IOException ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex);
    }
  }



}
