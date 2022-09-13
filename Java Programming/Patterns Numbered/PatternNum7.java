import java.util.Scanner;

public class PatternNum7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of arrow : ");
        int n = in.nextInt();
        
        int sp = n /  2;
        int st = 1;
        if(n % 2 != 0){
            for (int i = 1; i <= n; i++){
                for(int j = 1; j <= sp; j++){
                    if(i == n / 2 + 1){
                        System.out.print("*\t");
                    } else{
                        System.out.print("\t");
                    }
                }

                for(int j = 1; j <= st; j++){
                    System.out.print("*\t");
                }

                if(i <= n / 2){
                    st++;
                } else{
                    st--;
                }
                System.out.println();
        }
    }else{
        System.out.println("Input ODD number only!!! Try again");
    }
        in.close();

    }
}
