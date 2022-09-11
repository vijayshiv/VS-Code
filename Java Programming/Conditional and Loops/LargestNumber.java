import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number (a) : ");
        int a = in.nextInt();
        System.out.print("Enter the first number (b) : ");
        int b = in.nextInt();
        System.out.print("Enter the first number (c) : ");
        int c = in.nextInt();

        int max = a;
        if(b>max){
            max =b;
        }
        if (c>max){
            max = c;
        }

        System.out.println("The max number is : "+max);

        in.close();
    }
}
