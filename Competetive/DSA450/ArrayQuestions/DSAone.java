import java.util.*;

public class DSAone{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Integer> num = new ArrayList<Integer>();
    
            for(int i = 0; i < n; i++){
                num.add(in.nextInt());
            }
    
            // reverse list made
    
            ArrayList<Integer> revArrayList = new ArrayList<Integer>();
            for (int i = num.size() - 1; i >= 0; i--) {
                revArrayList.add(num.get(i));
            }
            for(Integer s : revArrayList){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
        
        //System.out.println(revArrayList);
        in.close();
    }
}