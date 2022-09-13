import java.util.*;

public class PatternNum4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want the table of ");
        int n = in.nextInt();

        for(int i = 1; i <=10; i++){
            int v = n *i;
            System.out.println(n + " x " +i+ " = " +v);
        }

        in.close();
    }
}
