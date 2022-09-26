import java.util.Scanner;

public class SearchString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string -> ");
        String s = in.next();
        System.out.println("Enter the target letter -> ");
        String f = in.next();

        System.out.println(search(s ,f));
        in.close();
    }

    public static String search(String s, String f){
        if(s.length() == 0){
            return null;
        }

        for(int i = 0; i < s.length(); i++){
            if(f.charAt(0) == s.charAt(i)){
                String c = String.valueOf(i);
                return c;
            }      
        }
        return "Not found";
    }
}