/*
  Uncomment different lines and check what happens
 */


import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
    //     ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       
    //     for(int i =0; i < 3; i++){
    //         list.add(new ArrayList<>());
    //    }

    //     for(int i = 0; i < 3; i++){
    //         for(int j =0; j < 3; j++){
    //         list.get(i).add(in.nextInt());
    //         }
    //    }
        int n = in.nextInt();
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i = 0; i < n; i++){
        arr.add(in.nextInt());
       }

       for(int val : arr){
        System.out.print(val + " ");
       }

       //System.out.println(arr);
       in.close();
    }
}
