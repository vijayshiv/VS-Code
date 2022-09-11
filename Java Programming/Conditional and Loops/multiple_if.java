import java.util.Scanner;

public class multiple_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Enter the Salary : ");
         float salary = in.nextFloat();

         if(salary>10000){
            salary +=1000;
            System.out.println("The salary after increment is : " + salary);
         }
         else if(salary>20000){
            salary +=2000;
            System.out.println("The salary after increment is : " + salary);
         }
         else if(salary>30000){
            salary +=3000;
            System.out.println("The salary after increment is : " + salary);
         }

         in.close();
    }
    
}
