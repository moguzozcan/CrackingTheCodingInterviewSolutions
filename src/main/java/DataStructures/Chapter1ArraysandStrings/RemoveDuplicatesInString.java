package DataStructures.Chapter1ArraysandStrings;

import java.util.Arrays;

/*
Design an algorithm and write code to remove the duplicate characters in a string without using any
additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method
 */
public class RemoveDuplicatesInString {

  /*
  This algorithm has O(N^3) complexity which is very bad :)
   */
  public static String removeDuplicates(String str) {
    StringBuilder stringBuilder = new StringBuilder(str);

    for (int i = 0; i < stringBuilder.length() - 1; i++) {
      for (int j = i + 1; j < stringBuilder.length(); j++) {
        if(stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
          stringBuilder.deleteCharAt(j);  //Uses System.arraycopy() which is O(N)
          j--;
        }
      }
    }
    return stringBuilder.toString();
  }

  public static String removeDuplicatesUsingSort(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(chars));
    System.out.println(stringBuilder.toString());

    for (int i = 0; i < stringBuilder.length() - 1; i++) {
      if(stringBuilder.charAt(i) ==  stringBuilder.charAt(i + 1)) {
        stringBuilder.deleteCharAt(i + 1);
        i--;
      }
    }

    return stringBuilder.toString();
  }
}
