import java.util.Scanner;

public class temperature{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float tempC = in.nextFloat();
        System.out.println("Enter the temperature in C : " + tempC);
        
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Ferahnite is : " + tempF);

        in.close();

    }
}