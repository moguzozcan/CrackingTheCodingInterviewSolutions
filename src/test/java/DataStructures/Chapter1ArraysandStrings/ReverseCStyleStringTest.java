package DataStructures.Chapter1ArraysandStrings;

import org.junit.Test;

public class ReverseCStyleStringTest {

  @Test
  public void testReverseString() {
    String str = "asdf\\0";
    System.out.println(str);

    String reversedStr = ReverseCStyleString.reverseCStyleString(str);
    System.out.println(reversedStr);
  }
}
