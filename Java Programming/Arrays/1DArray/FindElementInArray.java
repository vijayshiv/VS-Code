import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the numbers in array : ");     
        int  n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int idx = -1;
        System.out.print("Enter the value you want the place of : ");
        int data = in.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == data){
                idx = i + 1;
                break;
            }
        }
        System.out.print("The place of the value "+ data +" is "+ idx);

        in.close();
    }
}
