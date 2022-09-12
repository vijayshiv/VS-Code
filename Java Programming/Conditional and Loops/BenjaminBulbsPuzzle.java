import java.util.Scanner;

public class BenjaminBulbsPuzzle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of bulbs : ");
        int n = in.nextInt();

        for(int i = 1; i * i <= n; i++){
            System.out.println("The position of ON bulbs : " +(i*i)+ "th");
        }

        in.close();
    }
}
