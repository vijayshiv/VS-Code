public class ArrayInput {
    public static void main(String[] args) throws Exception{
        int[] arr;          // Array declaration  

        // Here we have taken 5 inputs at a time

        arr = new int[5];   // Array initialization

        // Array assingment
        
        arr[0] = 33;
        arr[1] = 56;
        arr[2] = 89;
        arr[3] = 93;
        arr[4] = 45;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Marks of "+(i+1) + "th is " + arr[i]);
        }
    }
}
