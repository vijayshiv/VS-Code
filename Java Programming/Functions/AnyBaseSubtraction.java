import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the base of the given numbers? -> ");
        int b = in.nextInt();
        System.out.print("Enter the smaller number first : ");
        int n1 = in.nextInt();
        System.out.print("Enter the other number : ");
        int n2 = in.nextInt();
        
        int d = getDifference(b, n1, n2);
        System.out.println(d);
        in.close();
    }

    public static int getDifference(int b, int n1, int n2){
        int rv = 0;

        int p = 1;
        int c = 0;

        while(n2 > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;
            if(d2 >= d1){
                c = 0;
                d = d2 -d1;
            }
            else{
                c = -1;
                d = d2 + b - d1;
            }

            rv = rv + d * p;
            p = p * 10;
        }

        System.out.print("The result after substraction is -> ");
        return rv;
    }
}
