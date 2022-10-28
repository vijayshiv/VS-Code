import java.util.*;

public class PowerofNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number -> ");
        int x = in.nextInt();
        System.out.print("Input the power -> ");
        int n = in.nextInt();
        int ans = power(x, n);
        System.out.println("The ans is = " + ans);
        in.close();
    }
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        return x*power(x, n -1);
    }
}