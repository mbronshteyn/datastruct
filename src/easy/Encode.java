package easy;

import java.util.HashMap;
import java.util.Map;

public class Encode {
  public static void main(String[] args) {
    Encode encode = new Encode();
    System.out.println(encode.encode("AAABBCC"));
    System.out.println(encode.encode("AAABBCCA"));
    System.out.println(encode.encode("ZAAABBCC"));
  }

  public String encode(String input) {

    Map<Character, Integer> accumulator = new HashMap<>();
    StringBuilder result = new StringBuilder();

    // convert String to char array
    char[] chars = input.toCharArray();
    char prevChar = 0;
    for (int i = 0; i < chars.length; i++) {
      char currentChar = chars[i];
      if (accumulator.containsKey(currentChar)) {
        // get value from map
        int count = accumulator.get(currentChar);
        accumulator.put(currentChar, ++count);
        prevChar = currentChar;
      } else {
        // we have a chance in character
        if (prevChar != 0) {
          int count = accumulator.get(prevChar);
          result.append(prevChar).append(count);
          accumulator.clear();
          prevChar = currentChar;
        } else if (currentChar != chars[i + 1]) {
          // case when we have only one char in sequence
          // and is the first one in sequence
          result.append(currentChar).append(1);
        }
        accumulator.put(currentChar, 1);
      }
    }

    // get the last count from the map
    int lastCount = accumulator.get(prevChar);
    result.append(prevChar).append(lastCount);

    return result.toString();
  }
}
