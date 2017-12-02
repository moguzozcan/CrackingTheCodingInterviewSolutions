package DataStructures.Chapter1ArraysandStrings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramStringsTest {

  @Test
  public void testAnagramStrings() {
    String str1 = "rail safety";
    String str2 = "fairy tales";

    Assert.assertTrue(AnagramStrings.isAnagram(str1, str2));

    String str3 = "rail safeta";
    String str4 = "fairy tales";

    Assert.assertFalse(AnagramStrings.isAnagram(str3, str4));

  }

  @Test
  public void testAnagramStringsWithoutSort() {
    String str1 = "rail safety";
    String str2 = "fairy tales";

    Assert.assertTrue(AnagramStrings.isAnagramWithoutSort(str1, str2));

    String str3 = "rail safeta";
    String str4 = "fairy tales";

    Assert.assertFalse(AnagramStrings.isAnagramWithoutSort(str3, str4));

  }
}