package DataStructures.Chapter1ArraysandStrings;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllSpacesInStringTest {

  @Test
  public void testReplaceAllSpacesInString() {

    String str = "asdf qwer zxcv";
    String newStr = ReplaceAllSpacesInString.replaceSpaces(str);
    Assert.assertEquals(newStr, "asdf%20qwer%20zxcv");

  }

  @Test
  public void testReplaceAllSpacesV2() {
    String str = "asdf qwer zxcv";
    String newStr = ReplaceAllSpacesInString.replaceSpacesv2(str);
    Assert.assertEquals(newStr, "asdf%20qwer%20zxcv");
  }
}
