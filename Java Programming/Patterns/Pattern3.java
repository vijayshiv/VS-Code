import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entert the length of rotated triangle : ");
        int n = in.nextInt();

        int sp = n-1;
        int st = 1; 
        for(int i = 1; i<=n; i++){
            // System.out.print(sp +", " +st);
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }

            sp--;
            st++;
            System.out.println();

            in.close();
        }

    }
}
