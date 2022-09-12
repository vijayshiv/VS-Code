import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = in.nextInt();
        System.out.print("Enter the number of rotation : ");
        int k = in.nextInt();

        int temp = n;
        int nod = 0;

        while(temp > 0){
            temp = temp / 10;
            nod++;
        }

        k = k % nod;
        if(k < 0){
            k = k+ nod;
        }

        int div = 1;
        int mult = 1;
        for(int i =1; i <= nod; i++){
            if(i <= k){
                div = div * 10;
            } else{
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;
        int rot = r * mult + q;
        System.out.print("Rotated number is : " +rot);

        in.close();
    }
}
