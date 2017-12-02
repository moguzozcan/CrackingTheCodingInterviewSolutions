package DataStructures.Chapter1ArraysandStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramStrings {

  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    } else {
      char[] c1 = str1.toCharArray();
      char[] c2 = str2.toCharArray();

      Arrays.sort(c1);
      Arrays.sort(c2);

      for (int i = 0; i < c1.length; i++) {
        if (c1[i] != c2[i]) {
          return false;
        }
      }
      return true;
    }
  }

  public static boolean isAnagramShort(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    } else {
      char[] c1 = str1.toCharArray();
      char[] c2 = str2.toCharArray();

      Arrays.sort(c1);
      Arrays.sort(c2);

      String sortedStr1 = new String(c1);
      String sortedStr2 = new String(c2);

      return sortedStr1.equals(sortedStr2);
    }
  }

  public static boolean isAnagramWithoutSort(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    } else {
      int[] countStr1 = new int[256];
      int[] countStr2 = new int[256];

      System.out.println((int) ' ');  //32
      for (int i = 0; i < str1.length(); i++) {
        countStr1[str1.charAt(i) ]++;
        countStr2[str2.charAt(i) ]++;
      }

      for (int j = 0; j < countStr1.length; j++) {
        if (countStr1[j] != countStr2[j]) {
          return false;
        }
      }
      return true;
    }
  }
}
