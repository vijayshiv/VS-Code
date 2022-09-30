import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        SortBubble(arr);
        System.out.println("The sorted array is -> " + Arrays.toString(arr));

        in.close();

    }
    public static void SortBubble(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            //for each step, max item will come at he last 
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                // now swap the largest numbers
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                } 
            }
            if(!swapped){
                break;
            }
        }
    }
}
