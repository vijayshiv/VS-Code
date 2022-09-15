import java.util.Scanner;

public class Showding {
    static int x = 90;
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        System.out.println(x);              //90
        int x = in.nextInt();
        System.out.println(x);              //40
        fun();                              //90
        in.close();
    }
    

    static void fun(){
        System.out.println(x);
    }
    
}
