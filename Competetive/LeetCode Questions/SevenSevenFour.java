
/*
Question - 774
Given a characters array letters that is sorted in non-decreasing order 
and a character target, return the smallest character in the array that 
is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
*/
/* https://leetcode.com/problems/find-smallest-letter-greater-than-target/  */

import java.util.*;

public class SevenSevenFour {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the elements in array -> ");
        char[] letters = in.next().toCharArray();

        System.out.print("Enter the target element -> ");
        char target = in.next().charAt(0);

        System.out.print("The element which is greater than the target letter is -> ");
        System.out.print(nextGreatestLetter(letters, target));

        in.close();
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length] ; 
    }
}