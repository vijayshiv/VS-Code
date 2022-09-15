import java.util.*;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // code for checking a number is armstrong or not


        // System.out.print("Enter the number you want to check : " );
        // int n = in.nextInt();
        // boolean ans = armstrongfunc(n);
        // System.out.println(ans);

        for(int i = 100; i < 1000; i++){            //for finding 3 digits armstrong number
            if(armstrongfunc(i)){
                System.out.println(i + " ");
            }
        }

        in.close();

    }
    // function to check if the number is armstrong or not.

    static boolean armstrongfunc(int b){
        int sum = 0;
        int a = b;
        
        while(a > 0){
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum = sum + cube; 
            a = a / 10;
        }
        if(b == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
