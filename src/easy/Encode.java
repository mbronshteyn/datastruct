package easy;

public class Encode {
  public static void main(String[] args) {
    validate("AAABBCC", "3A2B2C");
    validate("AAABBCCA", "3A2B2C1A");
    validate("ZAAABBCC", "1Z3A2B2C");
    validate("ZAZABBCCZ", "1Z1A1Z1A2B2C1Z");
    validate("A", "1A");
    validate("", "");
  }

  public static String encode(String input) {
    int counter = 1;
    // average on the buffer size
    StringBuilder stringBuilder = new StringBuilder(input.length());
    char[] array = input.toCharArray();
    for (int i = 0; i < array.length; i++) {
      // handle the end of the array
      if (i + 1 == array.length) {
        stringBuilder.append(counter).append(array[i]);
      } else if (array[i] == array[i + 1]) {
        // nothing to do but increment counter
        counter++;
      } else {
        stringBuilder.append(counter).append(array[i]);
        counter = 1;
      }
    }
    return stringBuilder.toString();
  }

  private static void validate(String actual, String expected){
      String result = encode(actual);
      if(result.equals(expected)){
          System.out.printf("SUCCESS: %s%n", result);
      } else {
        System.out.printf("ERROR: result: %s; expected: %s%n", result, expected);
      }

  }
}
