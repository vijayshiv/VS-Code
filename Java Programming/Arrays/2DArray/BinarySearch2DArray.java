import java.util.*;

public class BinarySearch2DArray{
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
        

        System.out.print("Enter the value you want to find -> ");
        int x = in.nextInt();

        // Searching starts here
        int i = 0;
        int j = arr[0].length - 1;
        in.close();
        while(i < arr.length && j >= 0){
            if(x == arr[i][j]){
                System.out.println( "The cooridates are -> (" + (i+1) +", " + (j+1) + ")");
                return;
            } else if(x < arr[i][j]){
                j--;
            } else{
                i++;
            }
        }
        
        System.out.println("Not Found");
    
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