import java.util.*;

public class DecreasingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = in.nextInt();
        System.out.print("The decreasing values are : ");
        decrease(n);
        in.close();

    }

    public static void decrease(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decrease(n - 1);
    }
}