import java.util.*;

public class getMazePaths{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the destination row : ");
        int n =in.nextInt();
        System.out.print("Enter the destination column : ");
        int m = in.nextInt();

        ArrayList<String> pths = getPaths(1,1,n,m);
        System.out.println("The total number of paths are -> " + pths);

        in.close();
    }
    public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc){
            hpaths = getPaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpaths = getPaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }
}