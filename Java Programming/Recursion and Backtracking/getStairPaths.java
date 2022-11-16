import java.util.*;

public class getStairPaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of stairs -> ");
        int n = in.nextInt();
        ArrayList<String> paths = getpath(n);
        System.out.println("The paths are -> " + paths);

        in.close();
    }
    public static ArrayList<String> getpath(int n){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getpath(n - 1);
        ArrayList<String> paths2 = getpath(n - 2);
        ArrayList<String> paths3 = getpath(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
