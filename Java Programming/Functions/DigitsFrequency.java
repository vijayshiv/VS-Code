import java.util.Scanner;

public class DigitsFrequency{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        System.out.print("Enter the digit you want to count : ");
        int d = in.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

        in.close();
    }
    

    // Here is the Get Digit Function that will find the number of digit in the number
    
    public static int getDigitFrequency(int n ,int d){
        int rv = 0;
        
        while(n > 0){
            int dig = n % 10;
            n = n / 10;

            if(dig == d){
                rv++;
            }
        }

        return rv;
    }
}