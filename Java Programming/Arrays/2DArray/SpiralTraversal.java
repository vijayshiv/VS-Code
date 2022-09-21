import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix -> ");
        int r = in.nextInt();
        int c = in.nextInt();

        System.out.println("Enter the elements of the matrix -> ");
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The matrix here is -> ");
        display(arr);

        System.out.println("The spiral traversal of the matrix is -> ");
        spiralrotation(arr, r, c);
        
        in.close();
    }

    public static void spiralrotation(int[][] spi, int r, int c){
        // all rows and columns initialized
        int minr = 0;
        int minc = 0;

        int maxr = spi.length-1;
        int maxc = spi[0].length-1;

        //while loop will end when all the elements are print so we will run it till r * c
        int tne = r * c;
        int cnt = 0;


        while(cnt < tne){
            // left wall 
            for(int i = minr, j = minc; i <= maxr && cnt < tne; i++){
                System.out.println(spi[i][j]);
                cnt++;
            }
            minc++;

             // bottom wall 
             for(int i = maxr, j = minc; j <= maxc && cnt < tne; j++){
                System.out.println(spi[i][j]);
                cnt++;
            }
            maxr--;

             // right wall 
             for(int i = maxr, j = maxc; i >= minr && cnt < tne; i--){
                System.out.println(spi[i][j]);
                cnt++;
            }
            maxc--;

             // top wall 
             for(int i = minr, j = maxc; j >= minc && cnt < tne; j--){
                System.out.println(spi[i][j]);
                cnt++;
            }
            minr++;
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
