package easy;

public class Encode {
  public static void main(String[] args) {
    Encode encode = new Encode();
    System.out.println(encode.encodeArray("AAABBCC"));
    System.out.println(encode.encodeArray("AAABBCCA"));
    System.out.println(encode.encodeArray("ZAAABBCC"));
    System.out.println(encode.encodeArray("ZAZABBCCZ"));
  }

  public String encodeArray(String input) {
    int counter = 1;
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
