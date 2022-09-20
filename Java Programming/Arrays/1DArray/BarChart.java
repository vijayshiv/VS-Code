import java.util.*;

public class BarChart {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the numbers in array : ");     
        int  n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("-------------------------------------------------");
        System.out.println();
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int f = max; f >= 1; f--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= f){
                    System.out.print("[] \t");
                } else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

        in.close();
    }
}
