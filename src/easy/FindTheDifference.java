package easy;

import java.util.Arrays;

public class FindTheDifference {
  public static void main(String[] args) {
    FindTheDifferenceSolution solution = new FindTheDifferenceSolution();

    System.out.println(solution.findTheDifference("abcd", "abzcd"));
  }


}

class FindTheDifferenceSolution {

  public char findTheDifference(String s, String t) {

    char c;

    // sort two input string as arrays
    char[] sarray = s.toCharArray();
    char[] tarray = t.toCharArray();
    Arrays.sort(sarray);
    Arrays.sort(tarray);

    for (int i = 0; i < sarray.length; i++) {
      if (Character.compare(sarray[i], tarray[i]) != 0) {
        return tarray[i];
      }
    }

    // if we got here, the last element is the difference
    return tarray[tarray.length - 1];

  }
}
