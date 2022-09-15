import java.util.*;
// this program is incomplete
public class SwapFunction{

    public static int swap(int x, int y){
        int temp = x;
        x =  y;
        y = temp; 

        return x;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = in.nextInt();
        System.out.print("Enter B  = ");
        int b = in.nextInt();

        System.out.print("Swapped number are = "+ swap(a,b));
        in.close();
    }
}