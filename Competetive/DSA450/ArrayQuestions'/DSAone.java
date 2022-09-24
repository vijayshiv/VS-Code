import java.util.*;

public class DSAone{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<String> num = new ArrayList<String>();
    
            for(int i = 0; i < n; i++){
                num.add(in.next());
            }
    
            // reverse list made
    
            ArrayList<String> revArrayList = new ArrayList<String>();
            for (int i = num.size() - 1; i >= 0; i--) {
                revArrayList.add(num.get(i));
            }
            for(String s : revArrayList){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
        
        //System.out.println(revArrayList);
        in.close();
    }
}