import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check  : ");
        int n = in.nextInt();
        int count = 0;
        
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+ " is a Prime number");
        } else{
            System.out.println(n+ " is not a Prime number");
        }

        in.close();
    }
}
