import java.util.*;

public class PalindromOfSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string -> ");
        String s = in.next();

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String ss = s.substring(i, j);
                if(isPalindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }

        in.close();

    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            } else{
                i++;
                j--;
            }
        }

        return true;
    }
}
