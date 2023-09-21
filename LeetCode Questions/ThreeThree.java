/*
34. Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/

/* https://leetcode.com/problems/search-in-rotated-sorted-array/  */

import java.util.*;

public class ThreeThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element -> ");
        int target = in.nextInt();

        int ans = search(arr, target);
        System.out.println("The target found at "+ ans + " index and the position is "+ (ans + 1) + "th in the array");
 
        in.close();
    }
    public static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        //if the pivot is not found then the arrayis not rotated, so just do binary search
        if(pivot == -1){
            return SimpleBS(arr, target, 0, arr.length - 1);
        }

        //if pivot is found you found 2 ascending arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return SimpleBS(arr, target, 0, pivot - 1);
        }

        return SimpleBS(arr, target, pivot + 1, arr.length - 1);
    }
    public static int SimpleBS(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // the 4 cases are over here

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
