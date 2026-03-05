package tree;

import java.io.*;
import java.util.*;

public class Subordinates {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static List<Integer>[] adj;
    static int[] count;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        adj = new ArrayList[n + 1];
        count = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            int boss = Integer.parseInt(line[i]);
            adj[boss].add(i + 2);
        }
        
        dfs(1);
        
        for (int i = 1; i <= n; i++) {
            out.print(count[i] + (i == n ? "\n" : " "));
        }
        out.flush();
    }
    
    static int dfs(int u) {
        int total = 0;
        for (int v : adj[u]) {
            total += 1 + dfs(v);
        }
        count[u] = total;
        return total;
    }
}
