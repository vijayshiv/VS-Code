import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of square matrix -> ");
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The matrix is here ->");
        display(arr);

        // Upper diagonal elements 

        System.out.println("The upper diagonal elements are -> ");
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
        in.close();
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
