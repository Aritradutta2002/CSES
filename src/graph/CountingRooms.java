package graph;

import java.io.*;
import java.util.*;

public class CountingRooms {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static char[][] grid;
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        
        grid = new char[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.' && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        
        out.println(count);
        out.flush();
    }
    
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < m && 
                grid[nx][ny] == '.' && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
