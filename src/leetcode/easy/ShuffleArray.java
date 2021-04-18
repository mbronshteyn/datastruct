package leetcode.easy;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * <p>Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7] Explanation: Since x1=2, x2=5, x3=1,
 * y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. Example 2:
 *
 * <p>Input: nums = [1,2,3,4,4,3,2,1], n = 4 Output: [1,4,2,3,3,2,4,1] Example 3:
 *
 * <p>Input: nums = [1,1,2,2], n = 2 Output: [1,2,1,2]
 *
 * <p>Constraints:
 *
 * <p>1 <= n <= 500 nums.length == 2n 1 <= nums[i] <= 10^3
 */
public class ShuffleArray {
  public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    for (int i = 0, z = 0; i < n; i++, z = z + 2) {
      result[z] = nums[i];
      result[z + 1] = nums[i + n];
    }
    return result;
  }

  public static void main(String[] args) {
    ShuffleArray shuffleArray = new ShuffleArray();

    int[] input = new int[] {2, 5, 1, 3, 4, 7};
    int n = input.length/2;

    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i] + " ");
    }

    System.out.print( ";  n = " + n + "\n\n"  );

    int[] result = shuffleArray.shuffle(input, n );

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
