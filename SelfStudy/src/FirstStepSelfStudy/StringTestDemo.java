package FirstStepSelfStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringTestDemo {

  public static void main(String[] args) throws IOException {
//    Scanner scanner = new Scanner(System.in);
//    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str1 = "abcdef";
    StringBuffer stb = new StringBuffer(str1);
    System.out.println(stb.reverse());
//    buf.readLine();
//    String str;
//    System.out.println("Enter a string:");
//    str = buf.readLine();
//    System.out.println(str.length());
//    System.out.println(str.charAt(2));
//    System.out.println(str.substring(2,4));
//    System.out.println(str.concat(" string concat"))
  }

}
