import java.util.*;

public class printStairPath{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of stairs -> ");
        int n = in.nextInt();
        System.out.print("The number of possible cases are -> ");
        printSP(n , "");
        in.close();
    }
    public static void printSP(int n, String ans){
        if( n < 0){
            return;
        }
        if( n== 0){
            System.out.print(ans + " ");
            return;
        }
        printSP(n - 1, ans + "1");
        printSP(n - 2, ans + "2");
        printSP(n - 3, ans + "3");
    }
}