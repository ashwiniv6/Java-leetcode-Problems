package threeSumMulti;

import java.util.Arrays;
/*
Problem Statement: 3Sum With Multiplicity

Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.

As the answer can be very large, return it modulo 109 + 7.



Example 1:
Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
Output: 20
Explanation:
Enumerating by the values (arr[i], arr[j], arr[k]):
(1, 2, 5) occurs 8 times;
(1, 3, 4) occurs 8 times;
(2, 2, 4) occurs 2 times;
(2, 3, 3) occurs 2 times.

Example 2:
Input: arr = [1,1,2,2,2,2], target = 5
Output: 12
Explanation:
arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
We choose one 1 from [1,1] in 2 ways,
and two 2s from [2,2,2,2] in 6 ways.


Constraints:

3 <= arr.length <= 3000
0 <= arr[i] <= 100
0 <= target <= 300
 */
public class summulti {
    public int threeSumMulti(int[] arr, int target) {

        //mod number
        int mod = 1000000007;

        //stores the result count
        int count = 0;

        //sorting the array
        Arrays.sort(arr);

        //outer loop for first element
        for (int index = 0; index < arr.length - 2; index++) {

            //second element
            int start = index + 1;

            //third element
            int end = arr.length - 1;

            //two pointer approach to find a sum
            while (start < end) {

                //if target is found
                if (arr[start] + arr[end] + arr[index] == target) {

                    //special case when we are at the ends of the same number
                    // Ex: [...1,2,2,2,2,2]
                    //           ^       ^
                    //for this we calculate the number of all possible combinations we can make to pick 2 elements i.e. nC2
                    if (arr[start] == arr[end]) {
                        count += nCr(end - start + 1);
                        count %= mod;

                        //we have already evaluated all combinations for this index
                        break;
                    }

                    //general case
                    // Ex: [...1,2,2,2,3,4,4]
                    //           ^         ^
                    // we have to find out all possible 2's and 4's we can make
                    // we store them as i and j for start and end pointers respectively
                    // for above ex, i=3 and j=2
                    // hence total combinations are i*j = 6
                    int i = 1, j = 1;
                    while (start + 1 < end && arr[start] == arr[start + 1]) {
                        start++;
                        i++;
                    }
                    while (start + 1 < end && arr[end] == arr[end - 1]) {
                        end--;
                        j++;
                    }
                    count += (i * j);
                    count %= mod;

                    //general condition for 2Sum when target is found
                    start++;end--;
                } else if (arr[start] + arr[end] + arr[index] > target) end--;
                else start++;
            }
        }
        return count % mod;
    }

    // function to return nC2
    private static int nCr(int n) {
        return n * (n - 1) / 2;
    }
}
