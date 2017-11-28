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
    sLargeString = "";
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
  public void testDifferentEncodingTrueString() {
    Assert.assertTrue(StringHasUniqueCharacters.isAllUniqueCharacter(sDifferentEncodingTrue));
  }

  @Test
  public void testDifferentEncodingFalseString() {
    Assert.assertFalse(StringHasUniqueCharacters.isAllUniqueCharacter(sDifferentEncodingFalse));
  }
}