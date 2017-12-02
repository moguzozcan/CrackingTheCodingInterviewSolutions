package DataStructures.Chapter1ArraysandStrings;

/*
Design an algorithm and write code to remove the duplicate characters in a string without using any
additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method
 */
public class RemoveDuplicatesInString {

  public static String removeDuplicates(String str) {
    StringBuilder stringBuilder = new StringBuilder(str);

    for (int i = 0; i < stringBuilder.length() - 1; i++) {
      for (int j = i; j < stringBuilder.length(); j++) {
        if(stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
          stringBuilder.deleteCharAt(j);
          j--;
        }
      }
    }
    return stringBuilder.toString();
  }
}
