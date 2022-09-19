import java.util.*;

public class SubsetOfanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int limit = (int)Math.pow(2, arr.length);
        for(int i = 0; i < limit; i++){
            String set = "";
            int temp = i;
            for(int j = arr.length-1; j >= 0; j--){
                int r = temp % 2;
                temp = temp / 2;

                if(r == 0){
                    set = "- \t" + set;
                }else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
            in.close();
        }
    }
}
