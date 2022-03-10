package ProgrammingSkills.Day1;
/*
Problem Statement:
Given two non-negative integers low and high.
Return the count of odd numbers between low and high (inclusive).

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].


Constraints:
0 <= low <= high <= 10^9

 */
public class Countodds {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0)
            return (high-low)/2;
        else
            return ((high-low)/2)+1;
    }
}
/*
Explanation:
 > The code is counting the number of odd numbers in a range.
 > The code starts by checking if both low and high are even, then returns the difference between high and low divided by 2.
 > If either one is not even, it will return the sum of 1 plus the difference between high and low divided by 2.
 > The code counts the number of odd numbers in a range.
 > The function first checks if both low and high are even or not.
 > If they are, then the return value is (high-low)/2.
 > If one of them is odd, then the return value is ((high-low)/2)+1.
 */
