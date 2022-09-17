public class ArrayBasics {
    public static void main(String[] args) throws Exception {
        int[] arr;
        arr = new int[5];
        
        arr[0] = 33;
        arr[1] = 56;
        arr[2] = 89;
        arr[3] = 93;
        arr[4] = 45;

        int[] two = arr;
        two[2] = 590;

        for(int i = 0; i < two.length; i++){
            System.out.println("Marks of "+(i+1) + "th is " + two[i]);
        }
    }
}
