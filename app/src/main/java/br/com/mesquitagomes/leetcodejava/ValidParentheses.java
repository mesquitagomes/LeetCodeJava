package br.com.mesquitagomes.leetcodejava;

/**
 * 20. Valid Parentheses
 * Easy
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * 
 * Input: s = "(]"
 * Output: false
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        char[] opener = new char[s.length()];
        int i = 0;

        if (s.length() % 2 != 0)
            return false;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                opener[i++] = c;
            else if (c == ')' && (i == 0 || opener[--i] != '('))
                return false;
            else if (c == ']' && (i == 0 || opener[--i] != '['))
                return false;
            else if (c == '}' && (i == 0 || opener[--i] != '{'))
                return false;
        }

        return !(i > 0);
    }

}
