import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        Cycle(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }

    public static void Cycle(int[] arr){
         int i = 0;
         while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmp;
            }else{
                i++;
            }
         }
    }
}
