import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();                                   // input number 

        int inv = 0;                                            // inverse number
        int op = 1;                                             // original position
        while(n !=0){
            int od = n%10;                                      // original digit
            int id = op;                                        // inverse digit
            int ip = od;                                        // inverse position

            inv = inv + id*(int)Math.pow(10, ip-1);

            n = n / 10;
            op++;
        }
        System.out.print("Inverse number is : " +inv);

        in.close();
    }
}
