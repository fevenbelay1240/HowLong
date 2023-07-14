/*
 * accept two integers and will output a multiplication table (base 10)  
 * from the lowest number to the highest number.
 * @author - feven mengistu
 * @version - 0.3
 * 
 * Problem Set 1
 * LoopTheLoop.java
 */

import java.util.*;

public class LoopTheLoop {

  /*
   * method to take in the two numbers and calculate the multiplication 
   * @param - numbers large and small
   */
  public static void multiply(int small, int large) {
    System.out.print(" ");
    System.out.print(" ");
    for (int k = small; k <= large; k++) {
      System.out.printf("%4d", k);
    }
    System.out.println(" ");
    System.out.println(" " + "-----------  ");

    for (int i = small; i <= large; i++) 
    {
      System.out.printf("%4d", i);
        for (int j = small; j <= large; j++) {
          System.out.printf("%4d", i * j);
      }
    System.out.println();
    }
  }

  public static void main(String[] args) {
    LoopTheLoop l = new LoopTheLoop();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();

    l.multiply(num, num2);
  }

}
