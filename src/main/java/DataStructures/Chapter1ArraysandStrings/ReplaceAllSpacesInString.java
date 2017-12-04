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

  public static String replaceSpacesv2(String str) {
    char[] chars = str.toCharArray();
    int spaceCount = 0;
    for (char c: chars) {
      if (c == ' ') {
        spaceCount++;
      }
    }

    char[] replacedChar = new char[(spaceCount * 2) + chars.length];

    for (int i = 0, j = 0; i < replacedChar.length; i++, j++) {
      if (chars[j] != ' ') {
        replacedChar[i] = chars[j];
      } else {
        replacedChar[i] = '%';
        replacedChar[i + 1] = '2';
        replacedChar[i + 2] = '0';
        i += 2;
      }
    }
    return new String(replacedChar);
  }
}