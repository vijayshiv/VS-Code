import java.util.*;

public class RotateBy90Degree{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix -> ");
        int r = in.nextInt();
        int c = in.nextInt();

        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        display(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;

            }
        }

        display(arr);
        in.close();
    }
    
    public static void display(int[][] arr){
        System.out.println("The matrix here is -> ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}