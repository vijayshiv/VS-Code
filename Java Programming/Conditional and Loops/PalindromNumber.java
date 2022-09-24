import java.util.*;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check -> ");
        int num = in.nextInt();
        int temp = num;
        int ans = 0;

        while(temp>0){
            int rem = temp % 10;
            temp =temp / 10;

            ans = ans * 10 + rem;
        }

        if(num == ans){
            System.out.println("The given number is a palindrom");
        } else{
            System.out.println("The given number is not a palindrom");
        }

        in.close();
    }
}
