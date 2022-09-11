import java.util.Scanner;

public class FibonacciSeriesLoops {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till you want the series : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        int i = 1;

        while(count<= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            i++;
            System.out.println(" The series "+ i + "th number is : "+ b);
        }
        System.out.println("The last number "+ i +" of the series is : " + b );

        in.close();
     }
}
