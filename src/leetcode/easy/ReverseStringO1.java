package leetcode.easy;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 * <p>
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseStringO1 {

  public static void main(String[] args) {
    ReverseStringO1Solution solution = new ReverseStringO1Solution();

    char[] array = "hello".toCharArray();
    solution.reverseString(array);

    System.out.println(array);

  }
}

class ReverseStringO1Solution {
  public void reverseString(char[] s) {

    if (s.length == 1) {
      return;
    }

    for (int i = 0, k = s.length - 1; i < k; i++, k--) {
      // swap characters
      char front = s[i];
      char end = s[k];
      s[i] = end;
      s[k] = front;
    }

  }
}
