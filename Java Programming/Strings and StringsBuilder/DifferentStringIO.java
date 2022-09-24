import java.util.*;

public class DifferentStringIO{
    public static void main(String[] args)  throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word -> ");
        String s1 = in.next();
        String s2 = in.next();
        String s3 = in.nextLine();
        System.out.println("Spaces are interpreted as another string when we use next() function ");

        System.out.println();

        System.out.println("s1 is the word before spaces only -> " + s1);
        System.out.println("s2 is the word after spaces only -> " + s2);

        System.out.println();

        System.out.println("The full sentence or statement is interpreted as string ");
        System.out.print("The full statement is s3 -> " +s3);
        System.out.println();
        in.close();
    }
}