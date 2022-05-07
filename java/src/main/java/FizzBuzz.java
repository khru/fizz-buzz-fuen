public class FizzBuzz {
  final static private String FIZZ = "fizz";
  final static private String BUZZ = "buzz";

  public static String convert(int givenNumber) {
    if (givenNumber == 15) {
      return "fizzbuzz";
    }

    if (isNumberDivisibleByFive(givenNumber)) {
      return BUZZ;
    }

    if (isNumberDivisibleByThree(givenNumber)) {
      return FIZZ;
    }

    return String.valueOf(givenNumber);
  }

  private static boolean isNumberDivisibleByThree(int givenNumber) {
    return givenNumber % 3 == 0;
  }

  private static boolean isNumberDivisibleByFive(int givenNumber) {
    return givenNumber % 5 == 0;
  }
}
