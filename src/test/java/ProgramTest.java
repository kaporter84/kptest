import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class ProgramTest {

  @Test
  public void TestCase1() {
    List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
    List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
    Assertions.assertTrue(EasyAlgos.isValidSubsequence(array, sequence));
  }

  @Test
  public void TestCase2() {
    int[] input = new int[] {1, 2, 3, 5, 6, 8, 9};
    int[] expected = new int[] {1, 4, 9, 25, 36, 64, 81};
    int[] actual = EasyAlgos.sortedSquaredArray(input);
    IntStream.range(0, expected.length).forEach(i -> Assertions.assertEquals(expected[i], actual[i]));
  }
}