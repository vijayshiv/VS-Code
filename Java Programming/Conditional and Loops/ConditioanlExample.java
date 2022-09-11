import java.util.Scanner;

public class ConditioanlExample {
    public static void main(String[] args) {
        /*
        Syntax of if statement
        if(boolean condition){
            // body
        }
        else{
            //do this other body
        }
         */

         Scanner in = new Scanner(System.in);
         System.out.print("Enter the Salary : ");
         float salary = in.nextFloat();

         if (salary > 10000){
            salary = salary+2000;
            System.out.println("The Salary after increment of 2000 is : " +salary);
         }
         else{
            salary = salary+1000;
            System.out.println("The salary after increment of 1000 is : " +salary);
         }

         in.close();
    }
}
