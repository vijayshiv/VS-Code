import java.util.Scanner;

public class DigitsofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int n =in.nextInt();
        
        int nod = 0;
        int temp = n;
        while(temp != 0){
            temp = temp/10;
            nod++;
        }
        int i = (int)Math.pow(10,nod-1);
        while(i != 0)
        {
            int q = n/i;
            System.out.println(q);
            n = n%i;
            i = i/10;
        }

        in.close();
    }
}
