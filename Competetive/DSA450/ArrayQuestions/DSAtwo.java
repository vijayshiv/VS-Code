import java.util.Scanner;

public class DSAtwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        getMinMax(a, n);
        in.close();
    }
    public static void getMinMax(long a[], long n){
        long max = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        long min = a[0];
        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min + " " + max);
        
    }
}
