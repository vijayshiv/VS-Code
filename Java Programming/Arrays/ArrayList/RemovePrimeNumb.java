import java.util.*;

public class RemovePrimeNumb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(in.nextInt());
        }
        solu(al);
        in.close();
    }


    
    public static void solu(ArrayList<Integer> al ){
        for(int i = al.size() - 1; i >= 0; i--){
            int val = al.get(i);
            if(isprime(val) == true){
                al.remove(i);
            }
        }
        for(int val1 : al){
            System.out.print(val1 + " ");
        }
    }
    public static boolean isprime(int n){
        for(int div = 2; div * div <= n; div++){
            if(n % div == 0){
                return false;
            }
        }
        return true;
    }
}
