import java.util.Scanner;

public class OccDigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int n = in.nextInt();
        System.out.print("Enter the number whose occurrence want to count : ");
        int f = in.nextInt();

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == f){
                count++;
            }
            n = n/10;
        }
        System.out.println("The number "+f+" occured " +count+ " times.");

        in.close();
    }
}
