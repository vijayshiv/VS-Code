import java.util.Scanner;

public class PythoreanTripletCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = in.nextInt();
        System.out.print("Enter b = ");
        int b = in.nextInt();
        System.out.print("Enter c = ");
        int c = in.nextInt();

        int max = a;

        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }

        if(max == a){
            boolean flag = ((b*b + c*c) == a*a);
            System.out.println(flag);
        } else if(max == b){
            boolean flag = ((a*a + c*c) == b*b);
            System.out.println(flag);
        }else{
            boolean flag = ((a*a + b*b) == c*c);
            System.out.println(flag);
        }

        in.close();
    }
}
