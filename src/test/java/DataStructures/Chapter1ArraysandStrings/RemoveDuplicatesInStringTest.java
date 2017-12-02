package DataStructures.Chapter1ArraysandStrings;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesInStringTest {

  @Test
  public void testRemoveDuplicatesInString() {
    String str = "asdfasgh";
    String noDuplicatesStr = RemoveDuplicatesInString.removeDuplicates(str);

    Assert.assertEquals("asdfgh", noDuplicatesStr);
  }

}
