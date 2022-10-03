import java.util.Scanner;


public class BinarySearch {
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
        int target = in.nextInt();

        int ans = SearchAscending(arr, target);
        System.out.print("The ans is at -> " + (ans + 1) + "th position");

        in.close();
    }
    public static int SearchAscending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        
        while(start <= end){
            int mid = (start + end) / 2;

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
    public static int SearchDecsending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        

        while(start <= end){
            int mid = (start + end) / 2;

            if(target > arr[mid]){
                end = mid - 1;
            } else if(target < arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
