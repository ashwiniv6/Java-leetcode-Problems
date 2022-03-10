package RemoveDuplicatesFromSortedArray;
/*
Problem Statement:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for(int i = 0; i < nums.length -1 ; i++){
            if(nums[i] != nums[i + 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length -1];
        return k+1;


    }
}

/*
Explananation:
 > The code starts by declaring a variable called nums.
 > It then declares another variable called j, which is initialized to 0.
 > The for loop iterates through the list of numbers and checks if the current number in the list is equal to the previous number in the list or not.
 > If it's not, then that means there was an insertion into this particular list and so we need to update our counter with what we just found out: for(int i = 0; i < nums.length -1 ; i++){ } This line says "for each iteration of this loop, do something."
 This first part says "for each iteration of this loop," meaning that every time you go around this loop, you will be doing something different from before.
 Then it says "do something," which tells us what exactly needs to happen during these iterations of loops: check if a certain number is equal to its predecessor or not (i).
 > If they are equal, then increment your counter by 1 (j++) because now you know how many times you've gone around this particular loop already.
 After all iterations have been done, return j+1 because now your counter has reached its maximum value and needs
 > The code computes the index of a number in an array.
 > The code begins by declaring a variable named j which is initialized to 0.
 Next, the for loop iterates through each element of the nums array and checks if it is equal to the next element in the list.
 > If so, then nums[j] = nums[i]; j++; is executed and j is incremented by 1.
 > The last line of this block executes return j+1; which returns the value of j plus one as its result.
 */
