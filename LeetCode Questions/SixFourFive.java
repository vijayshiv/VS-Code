/* 
645. Set Mismatch

You have a set of integers s, which originally contains all 
the numbers from 1 to n. Unfortunately, due to some error, 
one of the numbers in s got duplicated to another number in the set,
which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of 
this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

 */
/* https://leetcode.com/problems/set-mismatch/ */
import java.util.*;

public class SixFourFive{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
        in.close();

    }
    public static int[] findErrorNums(int[] nums) {
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

        for(int index = 0; index < nums.length; index++){
           if(nums[index] != index + 1){
               return new int[] {nums[index], index + 1};
           }
        }

        return new int[] {-1 -1};
    }
}