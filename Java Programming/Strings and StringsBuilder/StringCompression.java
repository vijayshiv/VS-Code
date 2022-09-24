import java.util.*;

public class StringCompression {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string here -> ");
        String str = in.next();
        System.out.print("The 1st compression is -> ");
        System.out.println(comp1(str));
        System.out.print("The 2nd compression is -> ");
        System.out.println(comp2(str));

        in.close();
    }

    public static String comp1(String str){
        String s = str.charAt(0) + "";
        for(int i = 1; i < str.length(); i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if(cur != prev){
                s += cur;
            }
        }
        return s;
    }
    public static String comp2(String str){
        int count = 1;
        String s = str.charAt(0) + "";
        for(int i = 1; i < str.length(); i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if(cur == prev){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s += cur;
            }
        }
        if(count > 1){
            s += count;
            count = 1;
        }
        return s;
    }
}
