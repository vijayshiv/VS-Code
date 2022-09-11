import java.util.Scanner;

public class typecasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        int num2 = input.nextInt();
        System.out.println("num1 is : " +num1+" Here I entered an int and the result is float called type casting");
        System.out.println("num2 is : " +num2);

        //Type casting Example

        int num3 = (int)(67.778f);
        System.out.println("num3 is : " +num3+ " It is changes from float to int explicitly");;


        //automatic type comversion

        int a =260;
        byte b = (byte)(a);
        System.out.println("Byte b value is : " +b); // 257 % 265 = 1
        System.out.println("Here byte data type is calclated as interger and last is converted in byte ");


        input.close();
    }
}