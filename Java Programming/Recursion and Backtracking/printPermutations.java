import java.util.*;

public class printPermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string -> ");
        String str = in.next();
        System.out.print("The possible permutations are -> ");
        pPer(str, "");
        in.close();
    }
    public static void pPer(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String left = ques.substring(0, i);
            String right = ques.substring(i + 1);
            String roq = left + right;

            pPer(roq, ans + ch);
        }
    }
}
