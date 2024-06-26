package p08_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04FileReader {
  public static void main(String[] args) {
    String fileName = "test.txt";
    try {
      FileInputStream fis = new FileInputStream(fileName); // byte 기반 : 이미지, 파일
      FileReader fr = new FileReader(fileName); // char 기반

      int data = 0;

      while ((data = fis.read()) != -1) System.out.print((char) data);
      System.out.println();
      fis.close();

      while ((data = fr.read()) != -1) System.out.print((char) data);
      System.out.println();
      fr.close();

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}