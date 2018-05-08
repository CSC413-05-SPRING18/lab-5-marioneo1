package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    try {
      File f = new File("src/lab5/Test.java");
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      String[] split;
      HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
      while ((readLine = b.readLine()) != null) {
        System.out.println(readLine);
        split = readLine.trim().split(" ");
        for (String ss : split)
        {
          //System.out.println(ss);
          if(wordCount.containsKey(ss))
          {
            //iterate word
            int count = wordCount.get(ss);
            wordCount.put(ss, count+1);

          }
          else {
            //add new word
            if (ss.equals(""))
            {

            }
            else {
              wordCount.put(ss, 1);
            }
          }
        }
      }
      System.out.println("Map: " + wordCount);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
