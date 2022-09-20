import java.util.Scanner;

public class SubarrayOfanAarray {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array -> ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements in array -> ");

        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(a[k] + "\t");
                }
                System.out.println();
            }
        }

        in.close();
    }
}
