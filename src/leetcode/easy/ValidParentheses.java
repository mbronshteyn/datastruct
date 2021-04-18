package leetcode.easy;

/*
20. Valid Parentheses
Easy

7272

301

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

import java.util.Stack;

public class ValidParentheses {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isValid("(){}}{"));
  }
}

class Solution {
  public boolean isValid(String s) {

    if (s.length() % 2 != 0) {
      return false;
    }

    char[] array = s.toCharArray();

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < array.length; i++) {
      if (array[i] == '{' || array[i] == '(' || array[i] == '[') {
        stack.push(array[i]);
      } else {
        if (stack.isEmpty() == true) {
          return false;
        }
        Character character = stack.pop();
        if (evaluate(character, array[i]) == false) {
          return false;
        }
      }
    }

    return stack.size() == 0;
  }

  private boolean evaluate(char left, char right) {
    if (left == '{' && right == '}') {
      return true;
    } else if (left == '(' && right == ')') {
      return true;
    } else return left == '[' && right == ']';
  }
}
