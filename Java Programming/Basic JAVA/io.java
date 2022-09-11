import java.util.Scanner;

public class io{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int num = input.nextInt();
        System.out.println("Your number is "+ num ); 

        input.close(); 
    }
}