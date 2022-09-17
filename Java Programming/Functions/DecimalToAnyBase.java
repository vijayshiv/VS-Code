import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int n = in.nextInt();
        System.out.print("Enter the base you want to convert : ");
        int b = in.nextInt();

        int dn = D2AB(n, b);
        System.out.println(dn);

        in.close();
    }

    public static int D2AB(int n, int b){

        int rv = 0;
        int p = 1;

        while(n > 0){ 
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }
        System.out.print("The converted value from decimal to base "+ b + " is ");
        return rv;
    }
}
