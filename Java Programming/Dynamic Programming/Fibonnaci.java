import java.util.*;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number of fibonnaci : ");
        int n = in.nextInt();
        int fibn = Fibmemorized(n, new int[n + 1]);
    
        System.out.println("The " + n +" th term in fibonnaci series is : " + fibn);

        in.close();
    }
    // This is simple fibonnaci question using recursion
    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        
        int fibnm1 = Fib(n - 1);
        int fibnm2 = Fib(n - 2);
        int fibn = fibnm1 + fibnm2;

        return fibn;
    }

    //This fibonnaci question using recursion + dynamic programming 
    public static int Fibmemorized(int n, int[] qb){
        if(n == 0 || n == 1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        
        int fibnm1 = Fibmemorized(n - 1, qb);
        int fibnm2 = Fibmemorized(n - 2, qb);
        int fibn = fibnm1 + fibnm2;

        qb[n] = fibn;
        return fibn;
    }
}
