package NumberofOneBits;
/*
Problem Statement: Number of 1 Bits

Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.


Example 1:
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

Example 2:
Input: n = 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

Example 3:
Input: n = 11111111111111111111111111111101
Output: 31
Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.


Constraints:
The input must be a binary string of length 32.

 */
public class Onebits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
            count = count + (n & 1);
            n = n>>>1;
        }
        return count;

    }
}
/*
Explanation:
 The code calculates the hamming weight of an integer.
 The code starts by initializing a variable called count to 0.
 It then loops while n is not equal to zero, incrementing count by one each time through the loop and setting n back to its original value (n>>>1).
 Finally, it returns the calculated hamming weight.
 The algorithm for calculating the hamming weight of an integer is as follows: while(n!=0) { count = count + (n & 1); } return count;
 The code attempts to calculate the Hamming weight of an integer.
 The code takes a number as input and calculates the Hamming weight of that number.

 */