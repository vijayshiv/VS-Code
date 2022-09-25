import java.util.Scanner;

public class DifferenceOfCharacters{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string here -> ");
        String str = in.nextLine();
        System.out.println("The differece between the charater is given here -> ");
        System.out.println(diffcharacter(str));

        in.close();
    }

    public static String diffcharacter(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = cur - prev;

            sb.append(gap);
            sb.append(cur);
        }

        return sb.toString();
    }
}