import java.util.Scanner;

public class FunctionOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // length() function gives the length of the string

        System.out.print("Enter the string -> ");
        String s = in.nextLine();
        System.out.println("The length of the string -> " + s.length());

        //if want to see the position of each character 

        System.out.print("The indexes are -> ");
        for(int i = 0; i < s.length(); i++){
            System.out.print(i + " ");
        }
        System.out.println();
        // if we want to see the char at fixed postion we use charAt() function

        char ch = s.charAt(1);
        System.out.println(ch);
        System.out.println();
        // code to print all the characters of a string

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println("The character at "+ i +" is " + c);
        }
        System.out.println();
        //Subsets of an array
        System.out.println("The substring of the string is from 1-3 -> " + s.substring(1, 3));

        System.out.println("Printing all the substrings of the string ");
        System.out.println("The substrings are -> ");
        for(int i = 0; i < s.length(); i++ ){
            for(int j = i + 1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }

        }

        in.close();
    }
}
