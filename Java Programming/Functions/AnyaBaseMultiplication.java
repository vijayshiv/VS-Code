import java.util.Scanner;

public class AnyaBaseMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the of the given number? -> ");
        int b = in.nextInt();
        System.out.print("Enter the 1st number -> ");
        int n1 = in.nextInt();
        System.out.print("Enter the 2nd number -> ");
        int n2 = in.nextInt();
        
        int ans = getProduct(b, n1, n2);
        System.out.println(ans);

        in.close();
    }

    public static int getProduct(int b, int n1, int n2){
        int rv = 0;
   
        //int c = 0;
        int p = 1;
        while(n2 > 0){
           int d2 = n2 % 10;
           n2 = n2 / 10;
   
           int pwd = getProductWithDigit(b, n1, d2);
           rv = getSum(b, rv, p * pwd);
           p = p * 10;
        }
   
        return rv;
    }
   
    public static int getProductWithDigit(int b, int n1, int d2){
        int rv = 0;
   
        int c = 0;
        int p = 1;
        while(n1 > 0 || c > 0){
           int d1 = n1 % 10;
           n1 = n1 / 10;
   
          int d = d1 * d2 + c;
          c = d / b;
          d = d % b;
   
          rv += d * p;
          p = p * 10;
        }
   
        return rv;
    }
   
    public static int getSum(int b, int n1, int n2){
       int rv = 0;
   
       int c = 0;
       int p = 1;
       while(n1 > 0 || n2 > 0 || c > 0){
          int d1 = n1 % 10;
          int d2 = n2 % 10;
          n1 = n1 / 10;
          n2 = n2 / 10;
   
          int d = d1 + d2 + c;
          c = d / b;
          d = d % b;
   
          rv += d * p;
          p = p * 10;
       }
   
       return rv;
   }
}
