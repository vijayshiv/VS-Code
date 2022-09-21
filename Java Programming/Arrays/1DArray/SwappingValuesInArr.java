/* 
 This swapping function is an example of shallow copying as in shallow copying the array got 
 allocated to stack memory but pointing towards same heap mempry where the address of elements in array 
 are placed.

 When the function memory vanishes after the function ran fully the stack memory of the array is vanished 
 but it changed the heap elements as it was pointing towards the same heap address.
 */

public class SwappingValuesInArr {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws Exception {
        int[] arr;
        arr = new int[5];
        
        arr[0] = 33;
        arr[1] = 56;
        arr[2] = 89;
        arr[3] = 93;
        arr[4] = 45;

        System.out.println("Before swapping values");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        swap(arr, 0, 4);

        System.out.println("After swapping");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
