import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzShould {

  @ParameterizedTest
  @CsvSource({
    "1,1",
    "2,2",
    "4,4"
  })
  public void should_convert_a_number_not_divisible_by_three_nor_five_to_the_same_number_as_string(String expected, int givenNumber) {
    assertEquals(expected,FizzBuzz.convert(givenNumber));
  }

  @Test
  public void convert_three_to_fizz() {
    assertEquals("fizz",FizzBuzz.convert(3));
  }
}
