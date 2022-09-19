import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        
        System.out.print("The real array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println();
        System.out.print("The reverse array is : ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        
        in.close();       
    }
}
