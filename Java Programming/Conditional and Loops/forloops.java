import java.util.Scanner;

public class forloops {
    public static void main(String[] args) {
        /*
            Syntax fof for loop

            for (initialization; condition; increment/decrement){
                //body
            }
         */


        //  for(int num =1; num<=5; num+=1){
        //     System.out.println(num);
        //  }

         Scanner in = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = in.nextInt();

         for (int i = 0; i <=n; i++) {
            System.out.println( "Hello world!!!!!! ");
         }
         in.close();
    }
}
