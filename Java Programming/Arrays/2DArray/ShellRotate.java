import java.util.*;

public class ShellRotate {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimensions if the array -> ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Enter the array here -> ");
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println("The given array is ->");
        display(arr);

        System.out.print("Enter the shell number -> ");
        int s = in.nextInt();
        System.out.print("Enter the number of rotations -> ");
        int r = in.nextInt();

        rotateshell(arr, s, r);

        System.out.println("The final array is -> ");
        display(arr);

        in.close();
    }
    public static void rotateshell(int[][] arr, int s, int r){
        int[] oned = fillOnedFomShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }
    public static void rotate(int[] oned, int r){
        r = r % oned.length;
        if(r < 0){
            r = r + oned.length;
        }
        reverse(oned, 0, oned.length - r -1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length-1);
    }
    public static void reverse(int[] oned, int li, int ri){
        while(li < ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            
            li++;
            ri--;
        }
    }
    public static int[] fillOnedFomShell(int[][] arr, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int sz = 2 * (maxr + maxc - minr - minc);

        int[] oned = new int[sz];

        int cnt = 0;    
        // left wall 
        for(int i = minr, j = minc; i <= maxr; i++){
            oned[cnt] = arr[i][j];
            cnt++;
        }
        // bottom wall 
        for(int i = maxr, j = minc + 1; j <= maxc; j++){
            oned[cnt] = arr[i][j];
            cnt++;
        }
        // right wall 
        for(int i = maxr - 1, j = maxc; i >= minr; i--){
            oned[cnt] = arr[i][j];
            cnt++;
        }
        // top wall 
        for(int i = minr, j = maxc - 1; j > minc; j--){
            oned[cnt] = arr[i][j];
            cnt++;
        }
        return oned;
    }
    public static void fillShellFromOned(int[][] arr, int s, int[] oned){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int cnt = 0;    
        // left wall 
        for(int i = minr, j = minc; i <= maxr; i++){
            arr[i][j] = oned[cnt];
            cnt++;
        }
        // bottom wall 
        for(int i = maxr, j = minc +1; j <= maxc; j++){
            arr[i][j] = oned[cnt];
            cnt++;
        }
        // right wall 
        for(int i = maxr - 1, j = maxc; i >= minr; i--){
            arr[i][j] = oned[cnt];
            cnt++;
        }
        // top wall 
        for(int i = minr, j = maxc - 1; j > minc; j--){
            arr[i][j] = oned[cnt];
            cnt++;
        }       
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
