import java.util.*;
/*
 * simplify the input positive integer into years, days, hours, minutes and seconds
 * @author feven mengistu
 * @version 0.2
 * 
 * Problem Set 1
 * HowLong.java
 */

public class HowLong {
  // variable initialization
  static int sec;
  static int min;
  static int hr;
  static int day;
  static int yr;

  /*
   * method to calculate the remainder and divisor of the input number
   * 
   * @param - Number, num to be simplified
   * @return - String consisting the simplified version
   */
  public static void div(int n) {
    day = n / (24 * 3600);
    n = n % (24 * 3600);
    hr = n / 3600;
    n %= 3600;
    min = n / 60;
    n %= 60;
    sec = n;
    System.out.println("Simplified form is: " + day + " " + "days " + hr + " " + "hours " + min + " "
        + "minutes " + sec + " " + "seconds ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nu = sc.nextInt();
    HowLong.div(nu);
  }

}
