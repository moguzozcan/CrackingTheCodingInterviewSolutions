package DataStructures.Chapter1ArraysandStrings;

/*
Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five
characters, including the null character.)
 */

public class ReverseCStyleString {

  public static String reverseCStyleString(String str) {

    StringBuilder reversedStr = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      reversedStr.append(str.charAt(i));
    }

    return reversedStr.toString();
  }
}