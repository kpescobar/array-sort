/**
 * 
 */
package edu.cnm.deepdive.arraysort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author Kelly Escobar
 *
 */
public class InputReader {
  public static float[][] list;

    InputReader(String fileToRead) {
      File inputRead = new File(fileToRead);
      try (
          FileReader reader = new FileReader(fileToRead);
          BufferedReader buffer = new BufferedReader(reader);
      ) {
        LinkedList<float[]> work = new LinkedList<>();
        String array;
        while ((array = buffer.readLine()) != null) {
          if (array.trim().length() > 0) {
            String[] values = array.trim().split("\\s+");
            float[] floatVals = new float[values.length];
            for (int i = 0; i < values.length; i++) {
              floatVals[i] = Float.parseFloat(values[i]);
            }
            work.add(floatVals);
          }
        }
        list = work.toArray(new float[0][]);
      } catch (FileNotFoundException ex) {
        ex.printStackTrace();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    
  }

