import java.util.*;

public class getSubSequenceReccursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String -> ");
        String str = in.next();
        ArrayList<String> res = gss(str);
        System.out.println("The Resulting substrings are " + res);
        in.close();

    }
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : rres) {
            mres.add("_" + rstr);
        }
        for (String rstr : rres) {
            mres.add(ch + rstr);
        }
        return mres;
    }
}