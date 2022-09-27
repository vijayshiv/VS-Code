import java.util.*;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ther length of array and then the elements -> ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the element you want the index of -> ");
        int f = in.nextInt();
        System.out.println("Enter the range of index -> ");
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        int ans = range(arr, f, start, end);
        System.out.println(ans);

    }
    public static int range(int[] arr, int f, int start ,int end){
        for(int i = start; i <= end; i++){
            if(start == end){
                return -1;
            }
            if(f == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
