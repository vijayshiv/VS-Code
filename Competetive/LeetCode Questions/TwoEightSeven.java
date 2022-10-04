/*
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers 
where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
 */

 /* https://leetcode.com/problems/find-the-duplicate-number/description/ */
import java.util.*;
public class TwoEightSeven {
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
        System.out.println("The Duplicate number is : " + ans);
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
                return nums[index];
            }
         }

         return -1;
    }
}
