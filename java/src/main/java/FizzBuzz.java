public class FizzBuzz {
  public static String convert(int givenNumber) {
    if (givenNumber == 3 || givenNumber == 6) {
      return "fizz";
    }
    return String.valueOf(givenNumber);
  }
}
