import java.util.*;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of tst cases -> ");
        int t = in.nextInt();
        while(t-- > 0){
            System.out.print("Enter the length of array -> ");
            int n = in.nextInt();
            int[] arr = new int[n];
            
            System.out.println("Enter the elements in array -> ");
            for(int i = 0; i < arr.length; i++){
                arr[i] = in.nextInt();
            }

            System.out.println("Enter the target element -> ");
            int target = in.nextInt();
            
            int ans = SerachAny(arr, target);
            System.out.print("The ans is at -> " + (ans + 1) + "th position");
            System.out.println();
        }

        in.close();

    }

    public static int SerachAny(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
