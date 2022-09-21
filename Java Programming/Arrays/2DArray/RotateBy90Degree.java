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
        System.out.println("The matrix here is -> ");
        display(arr);

        DegreeRotation(arr);
        System.out.println("The matrix after 90 Degree Rotaion is -> ");
        display(arr);
        in.close();
    }

    public static void DegreeRotation(int[][] rot){
        for(int i = 0; i < rot.length; i++){
            for(int j = i; j < rot[0].length; j++){
                int temp = rot[i][j];
                rot[i][j] = rot[j][i];
                rot[j][i] = temp;
            }
        }

        for(int i = 0; i < rot.length; i++){
            int li = 0;
            int ri = rot[i].length - 1;

            while(li < ri){
                int temp = rot[i][li];
                rot[i][li] = rot[i][ri];
                rot[i][ri] = temp;

                li++;
                ri--;

            }
        }
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}