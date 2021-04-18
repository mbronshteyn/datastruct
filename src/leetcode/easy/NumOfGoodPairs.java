package leetcode.easy;

/**
 * https://leetcode.com/problems/number-of-good-pairs/submissions/
 *
 * <p>Given an array of integers nums.
 *
 * <p>A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * <p>Return the number of good pairs.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [1,2,3,1,1,3] Output: 4 Explanation: There are 4 good pairs (0,3), (0,4), (3,4),
 * (2,5) 0-indexed. Example 2:
 *
 * <p>Input: nums = [1,1,1,1] Output: 6 Explanation: Each pair in the array are good. Example 3:
 *
 * <p>Input: nums = [1,2,3] Output: 0
 */
public class NumOfGoodPairs {
  public static void main(String[] args) {
    NumOfGoodPairsSolution solution = new NumOfGoodPairsSolution();

    int[] array = new int[]{1, 2, 3, 1, 1, 3};
    System.out.println("Number of good pairs: " + solution.numIdenticalPairs(array));
  }
}

class NumOfGoodPairsSolution {
  public int numIdenticalPairs(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      // iterate through the rest of the array
      for (int k = i + 1; k < nums.length; k++) {
        // check if there is a match
        if (nums[i] == nums[k]) {
          counter++;
        }
      }
    }
    return counter;
  }
}
