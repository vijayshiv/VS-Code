import java.util.*;

public class PowerofNumOptimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inout the number -> ");
        int x = in.nextInt();
        System.out.print("Inpout the power -> ");
        int n = in.nextInt();
        int ans = powerFunc(x, n);
        System.out.print("The answer is -> " + ans);
        in.close();
    }
    public static int powerFunc(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn = 1;
        if(n % 2 == 0){
            xn = powerFunc(x, n/2) * powerFunc(x , n/2);
        }
        else{
            xn = powerFunc(x, n/2) * powerFunc(x , n/2) * x;
        }
        return xn;
    }
}
