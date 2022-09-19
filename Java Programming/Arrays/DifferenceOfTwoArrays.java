import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of 2nd array larger");
        System.out.print("Enter the length of 1st array : ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the values : ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter the length of 2nd array : ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the values : ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
        }

        int[] diff = new int[n2];
        int c =0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while(k >= 0){
            
            int d = 0;
            int a1v = i >= 0 ? arr1[i] : 0;
            //System.out.println(j);

            if(arr2[j] + c >= a1v){
                d = arr2[j] + c - a1v;
                c = 0;
            }
            else{
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;

        }

        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        System.out.println("The ans of substraction is : ");
        while(idx < diff.length){
           System.out.print(diff[idx]); 
           idx++;
        }

        in.close();
        
    }
}
