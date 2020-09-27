/**
 * Given a string s and an integer array indices of the same length.
 * <p>
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * <p>
 * Return the shuffled string.
 */
public class ShuffleString {
  public static void main(String[] args) {
    ShuffleStringSolution solution = new ShuffleStringSolution();

    System.out.println(solution.restoreString(
            "codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
  }
}

class ShuffleStringSolution {
  public String restoreString(String s, int[] indices) {
    char[] array = s.toCharArray();
    char[] result = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      result[indices[i]] = array[i];
    }

    return new String(result);

  }
}
