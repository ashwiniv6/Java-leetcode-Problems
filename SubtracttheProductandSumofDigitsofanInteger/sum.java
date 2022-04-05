package SubtracttheProductandSumofDigitsofanInteger;
/*
Problem Statement: Subtract the Product and Sum of Digits of an Integer

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
public class sum {
    public int subtractProductAndSum(int n) {
        int sum  = 0;
        int product = 1;
        while(n>0){
            sum += n%10;
            product *= n%10;
            n/=10;
        }
        return product - sum;

    }
}
/* Explanation:
Get the number.
Declare a variable to store the sum and set it to 0.
Repeat the next two steps till the number is not 0.
Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and add it to sum.
Divide the number by 10 with help of ‘/’ operator to remove the rightmost digit.
Print or return the sum and Product.
Then return the Subtraction of the Product and Sum.
 */