import java.util.*;

public class LastIndexOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = in.nextInt();
        System.out.print("Input the elements in array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Input the target number : ");
        int target = in.nextInt();
  
        int ans = lastOccured(arr, 0, target);
        System.out.println("The last index value in array is (optimized way): " + ans);

        in.close();
    }
    public static int lastOccured(int[] arr, int i, int data){
        if(i == arr.length ){
            return -1;
        }
        int liisa = lastOccured(arr, i + 1, data);
        if(liisa == -1){
            if(arr[i] == data){
                return i;
            }
            else{
                return -1;
            }
        } else{
            return liisa;
        }

    }
}   
