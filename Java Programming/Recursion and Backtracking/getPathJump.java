import java.util.*;

public class getPathJump{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the destination row : ");
        int n = in.nextInt();
        System.out.print("Enter the destination column : ");
        int m = in.nextInt();

        ArrayList<String> ans = geJumpPath(1,1,n,m);
        System.out.println(ans);
        in.close();
    }
    public static ArrayList<String> geJumpPath(int sr, int sc, int dr, int dc){
        
        if(dr == sr && dc == sc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        //horizontal move
        for(int hmovesize = 1; hmovesize <= dc-sc; hmovesize++){
            ArrayList<String> hpaths = geJumpPath(sr, sc + hmovesize,dr,dc);
            for (String hpath : hpaths) {
                paths.add("h" + hmovesize + hpath);
            }
        }

        //vertical move
        for (int vmovesize = 1; vmovesize <= dr - sr; vmovesize++) {
            ArrayList<String> vpaths = geJumpPath(sr + vmovesize, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + vmovesize + vpath);
            }
        }

        //daigonal move
        for (int movesize = 1; movesize <= dc - sc && movesize <= dr - sr; movesize++) {
            ArrayList<String> dpaths = geJumpPath(sr + movesize, sc + movesize, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + movesize + dpath);
            }
        }
        
        return paths;
    }
}