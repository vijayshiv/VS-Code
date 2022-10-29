import java.util.*;

public class EulerTechnique{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the value in Euler tree : ");
        int n = in.nextInt();
        pz(n);
        in.close();
    }
    public static void pz(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        pz(n - 1);
        System.out.print(n + " ");
        pz(n - 1);
        System.out.print(n + " ");
    }
}