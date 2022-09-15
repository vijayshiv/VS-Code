import java.util.Scanner;

public class AnyBasetoDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be converted in decimal : ");
        int n = in.nextInt();
        System.out.print("What is the base of given number? -> ");
        int b = in.nextInt();

        int d = getValueInDecimal(n, b);
        System.out.println(d);

        in.close();

    }

    public static int getValueInDecimal(int n, int b){
        int rv = 0;
        int p = 1;

        while(n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;
        }
        System.out.print("The converted value from base "+ b + " to decimal is ");
        return rv;
    }
}
