package easy;

/*
1281. Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21


Constraints:

1 <= n <= 10^5
*/

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
  public static void main(String[] args) {
    SubtractTheProductAndSumOfDigitsOfAnIntegerSolution solution = new SubtractTheProductAndSumOfDigitsOfAnIntegerSolution();
    System.out.println(solution.subtractProductAndSum(234));
  }
}

class SubtractTheProductAndSumOfDigitsOfAnIntegerSolution {
  public int subtractProductAndSum(int n) {

    String str = Integer.toString(n);
    char[] array = str.toCharArray();

    int sum = 0;
    int product = 1;
    for (int i = 0; i < array.length; i++) {
      int value = Integer.valueOf(array[i]) - 48;
      sum += value;
      product *= value;
    }

    return product - sum;

  }
}
