package ProgrammingSkills.Day1;

import java.util.Arrays;
/*
Problem Statement:
Average Salary Excluding the Minimum and Maximum Salary
------------------------------------------------------------
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


Constraints:
3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.

 */
public class AvgSalary {
    public double average(int[] salary) {
        double sum = 0;
        Arrays.sort(salary);
        salary[0] = 0;
        salary[salary.length-1] = 0;
        for(int i = 0; i < salary.length; i++){
        sum += salary[i];
    }
        return(sum/(salary.length-2));
}
}
/*
Explanation:
 > The code is a function that takes an array of integers and returns the average value.
 > The code starts by sorting the values in the array, then it sets all but one to zero.
 > It iterates through each element of the sorted list, adding up their sum and dividing by how many elements are left in the list.
 > The code is written as follows: public double average(int[] salary) { double sum = 0; Arrays.sort(salary); salary[0] = 0; salary[salary.length-1] = 0; for(int i = 0; i < salary.length; i++){ //iterate through each element of the sorted list... } //end for loop... return (sum/(salary.length-2)); }
 > The code will average the salary of all employees in an array.
 */