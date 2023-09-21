/*
442. Find All Duplicates in an Array

Given an integer array nums of length n where all the integers 
of nums are in the range [1, n] and each integer appears once 
or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []
 */

 /* https://leetcode.com/problems/find-all-duplicates-in-an-array/description/ */
import java.util.*;

public class FourFourTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        findDuplicates(arr);
        in.close();
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int tmp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = tmp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }

        return ans;
    }
}
