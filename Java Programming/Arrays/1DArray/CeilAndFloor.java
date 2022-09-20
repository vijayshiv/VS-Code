import java.util.*;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        int data = in.nextInt();

        int lo = 0;
        int hi = a.length - 1;
        int ceil = 0;
        int floor = 0;

        while(lo <= hi){
            int mid  = (lo + hi)/2 ;
            if(data < a[mid]){
                hi = mid - 1;
                ceil = a[mid];
            }else if(data > a[mid]){
                lo = mid + 1;
                floor = a[mid];
            }else{
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }
        System.out.print(floor + " ");
        System.out.print(ceil);
        in.close();
    }
}
