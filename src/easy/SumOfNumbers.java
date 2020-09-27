package easy;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * <p>Return the running sum of nums.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is obtained as follows:
 * [1, 1+2, 1+2+3, 1+2+3+4]. Example 2:
 *
 * <p>Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5] Explanation: Running sum is obtained as follows:
 * [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. Example 3:
 *
 * <p>Input: nums = [3,1,2,10,1] Output: [3,4,6,16,17]
 */
public class SumOfNumbers {
  public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = nums.length; i >= 0; i--) {
      int sum = 0;
      for (int k = 0; k < i; k++) {
        sum += nums[k];
      }
      if (i == 0) break;
      result[i - 1] = sum;
    }

    return result;
  }

  public static void main(String[] args) {
    SumOfNumbers sumOfNumbers = new SumOfNumbers();

    int[] nums = new int[]{ 1, 2, 3, 4 };

    int[] result = sumOfNumbers.runningSum( nums );
    for (int j : result) {
      System.out.print(j + " ");
    }

  }
}
