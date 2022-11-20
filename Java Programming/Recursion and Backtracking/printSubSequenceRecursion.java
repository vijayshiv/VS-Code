import java.util.*;

public class printSubSequenceRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string here -> ");
        String str = in.next();
        System.out.print("The subsequence String are -> ");
        printSS(str, "");
        in.close();
    }
    public static void printSS(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans + "_");
    }
}
