
/*
 Given an array of integers nums sorted in non-decreasing order, 
 find the starting and ending position of a given target value.
 If target is not found in the array, return [-1, -1].
 You must write an algorithm with O(log n) runtime complexity.

 Input: nums = [5,7,7,8,8,10], target = 8
 Output: [3,4]
 */
/* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/  */

import java.util.*;

public class ThreeFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements in array -> ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        System.out.println("Enter the target element -> ");
        int target = in.nextInt();

        int[] result = searchRange(nums, target);
        for(int val: result){
            System.out.print(val + " ");
        }

        in.close();
    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans ={-1, -1};

        //check for first occurance if target is first index
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //this fucntion just returns the index value of the target
    public static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1; 

        int start = 0;
        int end = nums.length - 1;
        

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                //potential is found 
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}