import java.util.Scanner;

public class printKeypadCombination {
    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number on the keypad -> ");
        String str = in.next();
        System.out.print("Expected words that can form are -> ");
        printKPC(str , "");
        in.close();

    }
    
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void printKPC(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char cho = codeforch.charAt(i);
            printKPC(roq, ans + cho);            
        }
    }
}
