import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = in.nextInt();

        int on1 = n1;
        int on2 = n2;

        while(n1 % n2 != 0 ){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem; 
        }

        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("GCD : "+gcd);
        System.out.print("LCM : "+lcm);
        in.close();
    }
}
