import java.util.HashSet;
import java.util.Set;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 * Accepted
 * 547,253
 * Submissions
 * 632,316
 */
public class JewelsAndStones {
  public static void main(String[] args) {
    JewelsAndStonesSolution solution = new JewelsAndStonesSolution();
    String J = "aA";
    String S = "aAAbbbb";

    System.out.println("You have jewels: " + solution.numJewelsInStones(J, S));
  }
}

class JewelsAndStonesSolution {
  public int numJewelsInStones(String J, String S) {
    // create a set from J - jewels
    char[] jarray = J.toCharArray();
    Set<Character> jewels = new HashSet<>();
    for (int i = 0; i < jarray.length; i++) {
      jewels.add(jarray[i]);
    }

    int counter = 0;
    //  iterate through stones and find out how many of them jewels
    char[] sarray = S.toCharArray();
    for (int i = 0; i < sarray.length; i++) {
      Character c = sarray[i];
      if (jewels.contains(c)) {
        counter++;
      }
    }
    return counter;
  }
}
