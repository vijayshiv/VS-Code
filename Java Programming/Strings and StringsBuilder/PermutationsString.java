import java.util.*;

public class PermutationsString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want the permutations of -> ");
        String str = in.next();

        System.out.println("All the permutations are -> ");
        perstr(str);

        in.close();
    }

    public static int fact(int n){
        int val = 1;
        for(int i = 2; i <= n; i++){
            val = val * i;
        }
        return val;
    }

    public static void perstr(String str){
        int n = str.length();
        int f = fact(n);

        for(int i = 0; i < f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div = n; div >= 1; div--){
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.print(" ");
        }

    }
}