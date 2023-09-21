/*
268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the 
range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the ]
range [0,2]. 2 is the missing number in the range since it does not appear in nums.

 */

/* https://leetcode.com/problems/missing-number/description/  */

import java.util.*;
public class TwoSixEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int ans = missingNumber(arr);
        System.out.println("The missing number is : " + ans);
        in.close();

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
         while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int tmp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = tmp;
            }else{
                i++;
            }
         }

         for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
         }

         return nums.length;
    }
}
