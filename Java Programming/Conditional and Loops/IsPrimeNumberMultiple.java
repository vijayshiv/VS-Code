import java.util.Scanner;

public class IsPrimeNumberMultiple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total numbers you want to check : ");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number : ");
            int n = scn.nextInt();

            int count =0;
            for(int div =2; div*div <= n; div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n+ " is Prime");
            } else {
                System.out.println(n +" is Not Prime");
            } 
        }
        
        scn.close();
    }

}
    

