/*

 Saddle point means the number that we are searching is the minimum value in that row and maximum in the column i.e
 First we will find the minimum in the row and then check all the elements in the column

 Now, check left to right in the row which number is least
 then take that element and check top to bottom if that element is the greatest 
 If yes you found the saddle point.
 If no check the next hoizontal row.
 
 */


import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) {
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
        System.out.print("The saddle point is -> ");
        getSaddlePoint(arr);

        in.close();
    }
    public static void getSaddlePoint(int[][] spr){
        for(int i = 0; i < spr.length; i++){
            int svj = 0;
            for(int j = 1; j < spr[0].length; j++){
                if(spr[i][j] < spr[i][svj]){
                    svj = j;
                }
            }
            boolean flag = true;
            for(int k = 0; k < spr.length; k++){
                if(spr[k][svj] > spr[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(spr[i][svj]);
                return;
            }
        }

        System.out.println("Invalid input");
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
