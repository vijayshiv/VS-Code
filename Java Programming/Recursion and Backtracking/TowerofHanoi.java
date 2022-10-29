import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of disk : ");
        int n = in.nextInt();
        System.out.print("Input the name of towers : ");
        String td1 = in.next();
        String td2 = in.next();
        String td3 = in.next();
        toh(n, td1, td2, td3);
        in.close();
    }
    public static void toh(int n, String a, String b, String c){
        if(n == 0){
            return;
        }

        toh(n - 1, a, c, b);
        System.out.println(n + " [" + a + " -> " + b  + "]");
        toh(n - 1, c, b, a);
    }
}
