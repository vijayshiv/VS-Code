import java.util.*;

public class printMazePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the destination row : ");
        int n = in.nextInt();
        System.out.print("Enter the destination column : ");
        int m = in.nextInt();
        System.out.print("The possible paths are -> ");
        printMP(1, 1, n, m, "");
        in.close();

    }
    public static void printMP(int sr, int sc, int dr, int dc, String paths){
        if(sr > dr || sc > dc){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.print(paths + " ");
            return;
        }

        printMP(sr, sc + 1, dr, dc, paths + "h");
        printMP(sr + 1, sc, dr, dc, paths + "v");
    }
}
