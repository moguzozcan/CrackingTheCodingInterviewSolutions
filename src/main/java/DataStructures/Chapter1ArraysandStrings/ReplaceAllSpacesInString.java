package DataStructures.Chapter1ArraysandStrings;

public class ReplaceAllSpacesInString {

  public static String replaceSpaces(String str) {
    StringBuilder stringBuilder = new StringBuilder(str);

    for (int i = 0; i < stringBuilder.length(); i++) {
      if(stringBuilder.charAt(i) == ' ') {
        stringBuilder.replace(i, i + 1, "%20");
      }
    }

    return stringBuilder.toString();
  }
}