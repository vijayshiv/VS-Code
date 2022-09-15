import java.util.*;

public class IsPrimeFunction {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int n = in.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);

        in.close();
    }

    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        
        return c * c > n;
        

        
    }
}
