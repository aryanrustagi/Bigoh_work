package backTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeSolver {

    void ratInMaze(int[][] maze, int i, int j, List<String> ans, List<String> path) {
        int N = maze.length;

        if (i < 0 || i >= N || j < 0 || j >= N || maze[i][j] == 1 || maze[i][j] == 2) {
            return;
        }

        if (i == N - 1 && j == N - 1) {
            path.add("(" + i + "," + j + ")");
            ans.add(String.join(" -> ", path));
            path.remove(path.size() - 1);
            return;
        }

        maze[i][j] = 2;
        path.add("(" + i + "," + j + ")");

        ratInMaze(maze, i + 1, j, ans, path); // Down
        ratInMaze(maze, i - 1, j, ans, path); // Up
        ratInMaze(maze, i, j + 1, ans, path); // Right
        ratInMaze(maze, i, j - 1, ans, path); // Left

        // Backtrack
        maze[i][j] = 0;
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 0, 1 },
                { 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0 }
        };

        MazeSolver solver = new MazeSolver();
        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        solver.ratInMaze(maze, 0, 0, ans, path);

        if (ans.isEmpty()) {
            System.out.println("No path found!");
        } else {
            System.out.println("Paths from start to destination:");
            for (String p : ans) {
                System.out.println(p);
            }
        }
    }
}
