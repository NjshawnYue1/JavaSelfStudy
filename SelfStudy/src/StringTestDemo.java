import java.util.Scanner;

public class StringTestDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = new String();
    System.out.println("Enter a string:");
    str = scanner.next();
    System.out.println(str.length());
    System.out.println(str.charAt(2));
    System.out.println(str.substring(2,4));
    System.out.println(str.concat(" was it"));
  }

}
