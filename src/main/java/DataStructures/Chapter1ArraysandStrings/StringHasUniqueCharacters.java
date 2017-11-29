package DataStructures.Chapter1ArraysandStrings;

/* 1.1 Implement an algorithm to determine if a string has all unique characters.
   What if you can not use additional data structures?
 */

import java.util.HashSet;
import java.util.Set;

public class StringHasUniqueCharacters {

  private static Set<Character> set = new HashSet<>();

  public static boolean isAllUniqueCharacter(String str) {
    for(char c : str.toCharArray()) {
      if(set.contains(c)) {
        return false;
      } else {
        set.add(c);
      }
    }
    return true;
  }

  public static boolean isAllUniqueCharacterWithoutSet(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length() - 1; j++) {
        if (str.charAt(i) == str.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "asdf";
    System.out.println(isAllUniqueCharacter(s));
    String s1 = "asdfa";
    System.out.println(isAllUniqueCharacter(s1));

    System.out.println(isAllUniqueCharacterWithoutSet(s));
    System.out.println(isAllUniqueCharacterWithoutSet(s1));
  }
}