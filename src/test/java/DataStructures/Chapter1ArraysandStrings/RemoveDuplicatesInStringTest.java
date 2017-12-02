package DataStructures.Chapter1ArraysandStrings;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesInStringTest {

  @Test
  public void testRemoveDuplicatesInString() {
    String str = "asdfasgh";
    long start, end;
    start = System.currentTimeMillis();
    String noDuplicatesStr = RemoveDuplicatesInString.removeDuplicates(str);
    end = System.currentTimeMillis();
    Assert.assertEquals("asdfgh", noDuplicatesStr);
    System.out.println("Systemtime is: " + (end - start));
  }

  @Test
  public void testRemoveDuplicatesUsingSortInString() {
    String str = "asdfasgh";
    long start, end;
    start = System.currentTimeMillis();
    String noDuplicatesStr = RemoveDuplicatesInString.removeDuplicatesUsingSort(str);
    end = System.currentTimeMillis();
    Assert.assertEquals("asdfgh", noDuplicatesStr);
    System.out.println("Systemtime is: " + (end - start));
  }


}
