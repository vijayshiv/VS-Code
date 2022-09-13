import java.util.Scanner;

public class PatternNum5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of diamond : ");
        int n = in.nextInt();

        int sp = n/2;
        int st = 1;
        int val = 1;

        if(n % 2 != 0){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= sp; j++){
                    System.out.print("\t");
                }

                int cval = val;
                for(int j = 1; j <= st; j++){
                    System.out.print(cval + "\t");
                    if(j <= st/2){
                        cval++;
                    }
                    else{
                        cval--;
                    }
                }

                if(i <= n / 2){
                    sp--;
                    st +=2;
                    val++;
                } else{
                    sp++;
                    st -=2;
                    val--;
                }

                System.out.println();
            }
        } else{
            System.out.println("Enter only ODD number !!! Try Again");
        }

        in.close();
    }
}
