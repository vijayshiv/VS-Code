import java.util.*;

public class printEncodings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to encode -> ");
        String str = in.next();
        System.out.print("The possible encodings are -> ");
        printEc(str, "");
        in.close();
    }
    public static void printEc(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        } else if(ques.length() == 1){
            char ch = ques.charAt(0);
            if(ch == '0'){
                return;
            } else{
                int charvalue = ch - '0';
                char code = (char)('a' + charvalue - 1);
                ans = ans + code;
                System.out.print(ans + " ");
            }
        }else{
            char ch = ques.charAt(0);
            String ros = ques.substring(1);

            if (ch == '0') {
                return;
            } else {
                int charvalue = ch - '0';
                char code = (char) ('a' + charvalue - 1);
                printEc(ros, ans + code);    
            }
            String ch12 = ques.substring(0, 2);
            String roq = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)('a' + ch12v -1);
                printEc(roq, ans + code);
            }
        }
    }
}
