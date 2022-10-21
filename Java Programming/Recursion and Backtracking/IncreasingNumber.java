import java.util.*;

public class IncreasingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = in.nextInt();
        System.out.print("The increasing order is : ");
        increase(n);
        in.close();
    }
public static void increase(int n){
    if(n == 0){
        return;
    }
    increase(n - 1);
    System.out.print(n + " ");
}
}
