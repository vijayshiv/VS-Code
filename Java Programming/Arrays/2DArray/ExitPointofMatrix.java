import java.util.*;

public class ExitPointofMatrix{
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

        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + arr[i][j]) % 4;
            
            if(dir == 0){
                j++;
            } else if(dir == 1){
                i++;
            } else if(dir == 2){
                j--;
            } else if(dir == 3){
                i--;
            }

            if(i < 0){
                i++;
                break;
            } else if(j < 0){
                j++;
                break;
            } else if(i == arr.length){
                i--;
                break;
            }else if(j == arr.length){
                j--;
                break;
            }
        }
        System.out.println("The exit co-ordinates are ("+i+", "+j+")");
        in.close();
    }
}