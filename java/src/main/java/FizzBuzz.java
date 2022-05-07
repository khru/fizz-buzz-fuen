public class FizzBuzz {
  public static String convert(int givenNumber) {
    if (givenNumber == 5) {
      return "buzz";
    }

    if (givenNumber % 3 == 0) {
      return "fizz";
    }
    return String.valueOf(givenNumber);
  }
}
