package easy;

public class Encode {
  public static void main(String[] args) {
    Encode encode = new Encode();
    System.out.println(encode.encode("AAABBCC"));
    System.out.println(encode.encode("AAABBCCA"));
    System.out.println(encode.encode("ZAAABBCC"));
    System.out.println(encode.encode("ZAZABBCCZ"));
    System.out.println(encode.encode("A"));
    System.out.println(encode.encode(""));
  }

  public String encode(String input) {
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
}
