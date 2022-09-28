/*
 Ceiling = smallest elemebt in array greater or equal to target
 arr = [12, 34, 35, 89, 90, 91] , target = 24
 ceiling(arr, target) = 34

 We need to return the smallest greater element if we cannot find the element in the array.
 */
// Binary search question 

import java.util.*;

public class CeilingOfNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the target element -> ");
        int t = in.nextInt();

        int ans = ceiling(arr, t);
        System.out.println("The ans is at -> " + (ans + 1) + "th position");
        System.out.println(arr[ans] + " in the number greater than or equal to target number.");

        in.close();
    }

    public static int ceiling(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;
        boolean asds = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + end) / 2;

            // for comman outcome i.e. if the value is found at middle of the array.
            if(arr[mid] == t){
                return mid;
            }

            // this is for the ascending and decsending order loop.
            //if true then it is ascending else descending.
            if(asds == true){
                if(t < arr[mid]){
                    end = mid - 1;
                } else if(t > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(t > arr[mid]){
                    end = mid - 1;
                } else if(t < arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return end + 1;
    }
}
