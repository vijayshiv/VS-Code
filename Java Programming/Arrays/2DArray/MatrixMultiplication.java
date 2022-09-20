import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimensions of 1st matrix -> ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.println("Enter the dimensions of 2nd matrix -> ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        if(c1 != r2){
            System.out.println("Invalid Input");
            in.close();
            return ;
        }

        int[][] one = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                one[i][j] = in.nextInt();
            }
        }

        int[][] two = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                two[i][j] = in.nextInt();
            }
        }

        int[][] prod = new int[r1][c2];
        for(int i = 0; i < prod.length; i++){
            for(int j = 0; j < prod[i].length; j++){
                for(int k = 0; k < c1; k++){
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        System.out.println("The multiplied matrix is -> ");
        for(int i = 0; i < prod.length; i++){
            for(int j = 0; j < prod[i].length; j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
