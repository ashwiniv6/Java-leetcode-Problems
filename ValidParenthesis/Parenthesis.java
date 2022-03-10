package ValidParenthesis;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/*
Problem Statement:
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


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */


public class Parenthesis {
        public boolean isValid(@NotNull String s) {
            Stack<Character> stack = new Stack<>();
            for (char c: s.toCharArray()){
                if (stack.empty()){
                    if(isClosing(c)) return false;
                    else stack.push(c);
                } else if (isClosing(c)){
                    int diff = stack.pop() - c;
                    if (diff > 0 || diff < -2) return false;
                } else
                    stack.push(c);
            }
            return stack.empty();
        }

        boolean isClosing(char c){
            return c == ']' || c == ')' || c == '}';
        }



}
