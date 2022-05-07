public class FizzBuzz {
  final static private String FIZZ = "fizz";
  final static private String BUZZ = "buzz";
  final static private String FIZZBUZZ = "fizzbuzz";

  public static String convert(int givenNumber) {
    if (isNumberDivisibleByFifteen(givenNumber)) {
      return FIZZBUZZ;
    }

    if (isNumberDivisibleByFive(givenNumber)) {
      return BUZZ;

    }

    if (isNumberDivisibleByThree(givenNumber)) {
      return FIZZ;
    }

    return String.valueOf(givenNumber);
  }

  private static boolean isNumberDivisibleByFifteen(int givenNumber) {
    return givenNumber % 15 == 0;
  }

  private static boolean isNumberDivisibleByThree(int givenNumber) {
    return givenNumber % 3 == 0;
  }

  private static boolean isNumberDivisibleByFive(int givenNumber) {
    return givenNumber % 5 == 0;
  }
}
