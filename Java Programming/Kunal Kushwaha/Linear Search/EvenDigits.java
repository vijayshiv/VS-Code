import java.util.*;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        check(arr);

        in.close();

    }
    public static void check(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(evendig2(n) == true){
                System.out.println(arr[i] + " -> has even digits");
            }else{
                System.err.println(arr[i] + " has odd digits");
            }
        }
    }

    public static boolean evendig(int n){
        if(n < 0){
            n = n * -1;
        }
        int nod = 0;

        while(n > 0){
            n = n / 10;
            nod++;
        }
        if(nod % 2 == 0){
            return true;
        }

        return false;
    }
    // this is the optimized version of the evendig function above
    
    public static boolean evendig2(int n){
        if(n < 0){
            n = n * -1;
        }
        int nod = (int)Math.log10(n) + 1;
        if(nod % 2 == 0){
            return true;
        }

        return false;
    }
}