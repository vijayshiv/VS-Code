import java.util.*;

public class printMazePathJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the destination row : ");
        int n = in.nextInt();
        System.out.print("Enter the destination column : ");
        int m = in.nextInt();
        System.out.print("The possible jump paths are -> ");
        printMPJ(1,1,n,m,"");
        in.close();

    }
    public static void printMPJ(int sr, int sc, int dr, int dc, String paths){
        if(sr == dr && sc == dc){
            System.out.print(paths + " ");
            return;
        }
        for (int hmovesize = 1; hmovesize <= dc - sc; hmovesize++) {
            printMPJ(sr, sc + hmovesize, dr, dc, paths + "h" + hmovesize);
        }

        // vertical move
        for (int vmovesize = 1; vmovesize <= dr - sr; vmovesize++) {
            printMPJ(sr + vmovesize, sc, dr, dc, paths + "v" + vmovesize);
        }

        // daigonal move
        for (int movesize = 1; movesize <= dc - sc && movesize <= dr - sr; movesize++) {
            printMPJ(sr + movesize, sc + movesize, dr, dc, paths + "d" + movesize);
        }
    }
}
