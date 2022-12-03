import java.util.*;

public class FloodFill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows -> ");
        int n = in.nextInt();
        System.out.print("Enter the number of column -> ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements in the array -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        System.out.print("The required paths are -> ");
        getpaths(arr, 0, 0, "", visited);

        in.close();
    }

    public static void getpaths(int[][] maze, int row, int col, String path, boolean[][] visited){
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length|| maze[row][col] == 1|| visited[row][col] == true){
            return;
        }
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.print(path + " ");
            return;
        }

        visited[row][col] = true;
        getpaths(maze, row - 1, col, path + "t", visited);
        getpaths(maze, row, col - 1, path + "l", visited);
        getpaths(maze, row + 1, col, path + "d", visited);
        getpaths(maze, row, col + 1, path + "r", visited);
        visited[row][col] = false;
    }
}
