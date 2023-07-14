/* Reads one line of text then do it's Ubbi Dubbi translation
 * @author - feven mengistu
 * @version - 0.2
 * Problem Set 1
 * UbbiDubbi.java
 */

import java.util.*;

public class UbbiDubbi {

  /*
   * METHOD TO CHECK IF THE CHARACTER C IS ANY OF THE VOWEL LETTERS LOWECASE OR
   * UPPERCASE
   * 
   * @param - char c that comes from the character array read from the translate
   * method
   * @return - true if the char c is a vowel
   */
  private boolean isVowel(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
        || c == 'U') {
      return true;
    }
    return false;
  }

  /*
   * METHOD TO TRANSLATE THOSE CHARACTERS THAT ARE VOWELS AND ADD "ub" before the
   * vowels
   * 
   * @param - string text input from the keyboard
   * @return - updated and translated string text
   */
  private String ubText(String text) {
    String translated = "";
    boolean vowel = false;
    for (char c : text.toCharArray()) {
      if (isVowel(c)) {
        if (!vowel) {
          translated += "ub";
        }
        vowel = true;
      } else {
        vowel = false;
      }
      translated += c;
    }
    return translated;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String txt = scanner.nextLine();
    UbbiDubbi u = new UbbiDubbi();
    System.out.print(u.ubText(txt));

  }

}
