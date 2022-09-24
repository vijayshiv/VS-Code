/*
 Coverting all upper case letters to lower case and vice-versa for all the character of an string

 */

import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string here -> ");
        String str = in.nextLine();
        System.out.println("The toggled string is here -> ");
        System.out.println(toggle(str));

        in.close();
    }

    public static String toggle(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < str.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);
            } else if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }

        return sb.toString();
    }
}
