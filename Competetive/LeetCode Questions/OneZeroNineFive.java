/*
You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that 
mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the
array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be 
judged Wrong Answer. Also, any solutions that attempt to circumvent 
the judge will result in disqualification.

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. 
Return the minimum index, which is 2.

*/

/* https://leetcode.com/problems/find-in-mountain-array/  */

import java.util.*;

public class OneZeroNineFive {
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
        int ans = result(arr, target);
        System.out.print("The lowest index on which the number is found -> " + ans + ". ");
        System.out.println("Also the position is " + (ans + 1) + "th in the array");
        in.close();

    }
    public static int result(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in the second half 
        return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //you are in decreasing part of the arary
                // this may be the ans but look at the left

                end = mid;
            } else{
                //you are in asc part of the arary

                start = mid + 1;
            }
        }
        //in the end , start = edn and potnting to the largest number becoz of thse to checks
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =

    }

    public static int OrderAgnosticBS(int[] arr, int target, int start, int end){
        
        boolean asds = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + end) / 2;

            // for comman outcome i.e. if the value is found at middle of the array.
            if(arr[mid] == target){
                return mid;
            }

            // this is for the ascending and decsending order loop.
            //if true then it is ascending else descending.
            if(asds == true){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}