import java.util.*;

public class SpiralTraversal {
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
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        // all rows and columns initialized
        int minr = 0;
        int minc = 0;

        int maxr = arr.length-1;
        int maxc = arr[0].length-1;

        //while loop will end when all the elements are print so we will run it till r * c
        int tne = r * c;
        int cnt = 0;

        System.out.println("The spiral traversal of the matrix is -> ");
        while(cnt < tne){
            // left wall 
            for(int i = minr, j = minc; i <= maxr && cnt < tne; i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

             // bottom wall 
             for(int i = maxr, j = minc; j <= maxc && cnt < tne; j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

             // right wall 
             for(int i = maxr, j = maxc; i >= minr && cnt < tne; i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

             // top wall 
             for(int i = minr, j = maxc; j >= minc && cnt < tne; j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }

        in.close();
    }
}
