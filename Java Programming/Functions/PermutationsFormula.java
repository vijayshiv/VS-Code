import java.util.*;


public class PermutationsFormula{
    //display function to give the print value

    public static void display(int n, int r, int npr){
        System.out.println(n + "_P_" + r +" = " + npr);
    }
    // fact function to find the factorial of the number 

    public static int fact(int x){
        int rv = 1;

        for(int i = 1; i <= x; i++){
            rv = rv * i;
        }
        return rv;
    }
    // main function to get the n p r formula without loop
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n  = in.nextInt();
        System.out.print("Enter the value of r btw 0 to "+ n +" : " );
        int r = in.nextInt();

        int nfact = fact(n);                    // fact function call
        int nmrfact = fact(n - r);              // fact function call

        int npr  = nfact / nmrfact;
        display(n ,r ,npr);                     // display function call

        in.close();
    }

}