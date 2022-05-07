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
  public void convert_a_number_not_divisible_by_three_nor_five_to_the_same_number_as_string(String expected, int givenNumber) {
    assertEquals(expected,FizzBuzz.convert(givenNumber));
  }

  @ParameterizedTest
  @CsvSource({
    "3",
    "6",
    "9"
  })
  public void convert_a_number_divisible_by_three_not_five_to_fizz(int givenNumber) {
    assertEquals("fizz",FizzBuzz.convert(givenNumber));
  }

  @ParameterizedTest
  @CsvSource({
    "5",
    "10",
    "20"
  })
  public void convert_a_number_divisible_by_five_not_three_to_buzz(int givenNumber) {
    assertEquals("buzz",FizzBuzz.convert(givenNumber));
  }

  @Test
  public void convert_15_to_fizzbuzz() {
    assertEquals("fizzbuzz",FizzBuzz.convert(15));
  }

  @Test
  public void convert_30_to_fizzbuzz() {
    assertEquals("fizzbuzz",FizzBuzz.convert(30));
  }

}
