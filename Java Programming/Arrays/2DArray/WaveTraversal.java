import java.util.*;

public class WaveTraversal {
    public static void main(String[] args) throws Exception{
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
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("The traversal olf the matrix is -> ");
        for(int col = 0; col < arr[0].length; col++){
            if(col % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i][col]);
                }
            }else{
                for(int i = arr.length-1; i >= 0; i--){
                    System.out.println(arr[i][col]);
                }
            }
        }

        in.close();
    }
}
