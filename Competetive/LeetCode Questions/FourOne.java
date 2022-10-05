/*
41. First Missing Positive

Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
*/

/* https://leetcode.com/problems/first-missing-positive/ */

import java.util.*;

public class FourOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int ans = firstMissingPositive(arr);
        System.out.println("The first missing positive number is : " + ans);
        in.close();
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
           int correct = nums[i] - 1;
           if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
               int tmp = nums[i];
               nums[i] = nums[correct];
               nums[correct] = tmp;
           }else{
               i++;
           }
        }

        for(int index = 0; index < nums.length; index++){
           if(nums[index] != index + 1){
               return index + 1;
           }
        }

        return nums.length + 1;
    }
}
