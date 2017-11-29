package DataStructures.Chapter1ArraysandStrings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringHasUniqueCharactersTest {

  String sUniqueChars, sHasSameChars, sEmptyString, sLargeString,
      sDifferentEncodingTrue, sDifferentEncodingFalse;

  @Before
  public void initStrings() {
    sUniqueChars = "asdfghjkl";
    sHasSameChars = "qwertyuq";
    sEmptyString = "";
    sLargeString = createDataSize(1024);
    sDifferentEncodingTrue = "asdqwe\nxcf\rjkl";
    sDifferentEncodingFalse = "asd\nf\n\rw";
  }

  @Test
  public void testUniqueString() {
    Assert.assertTrue(StringHasUniqueCharacters.isAllUniqueCharacter(sUniqueChars));
  }

  @Test
  public void testSameCharsString() {
    Assert.assertFalse(StringHasUniqueCharacters.isAllUniqueCharacter(sHasSameChars));
  }

  @Test
  public void testEmptyCharsString() {
    Assert.assertTrue(StringHasUniqueCharacters.isAllUniqueCharacter(sEmptyString));
  }

  @Test
  public void testLargeString() {
    Assert.assertFalse(StringHasUniqueCharacters.isAllUniqueCharacter(sLargeString));
  }

  @Test
  public void testDifferentEncodingTrueString() {
    Assert.assertTrue(StringHasUniqueCharacters.isAllUniqueCharacter(sDifferentEncodingTrue));
  }

  @Test
  public void testDifferentEncodingFalseString() {
    Assert.assertFalse(StringHasUniqueCharacters.isAllUniqueCharacter(sDifferentEncodingFalse));
  }

  private static String createDataSize(int msgSize) {
    // Java chars are 2 bytes
    msgSize = msgSize/2;
    msgSize = msgSize * 1024;
    StringBuilder sb = new StringBuilder(msgSize);
    for (int i=0; i<msgSize; i++) {
      sb.append('a');
    }
    return sb.toString();
  }
}