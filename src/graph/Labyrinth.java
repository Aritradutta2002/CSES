package graph;
/**
 * Problem Name: Labyrinth
 * Link: https://cses.fi/problemset/task/1193
 * 
 * You are given a map of a labyrinth, and your task is to find a path from start to end. You can walk left, right, up and down.
 * 
 * Input
 * The first input line has two integers n and m: the height and width of the map.
 * Then there are n lines of m characters describing the labyrinth. Each character is . (floor), # (wall), A (start), or B (end). There is exactly one A and one B in the input.
 * 
 * Output
 * First print "YES", if there is a path, and "NO" otherwise.
 * If there is a path, print the length of the shortest such path and its description as a string consisting of characters L (left), R (right), U (up), and D (down). You can print any valid solution.
 * 
 * Constraints
 * 1 <= n,m <= 1000
 * 
 * Example
 * Input:
 * 5 8
 * ########
 * #.A#...#
 * #.##.#B#
 * #......#
 * ########
 * 
 * Output:
 * YES
 * 9
 * LDDRRRRRU
 */
/*
 * Author  : Aritra Dutta
 * Platform: CSES
 * Problem : Problem Name
 * Created : 05.04.2026 19:35
 * Link    : https://cses.fi/problemset/task/
 */
import java.io.*;
import java.util.*;

public class Labyrinth {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;
    static final int MOD = 1_000_000_007;
    static final long INF = (long) 1e18;

    // directions: D, U, R, L — matching the moves array
    private static int[] di = {1, -1, 0, 0};
    private static int[] dj = {0, 0, 1, -1};
    private static char[] dirChar = {'D', 'U', 'R', 'L'};
    
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.flush();
        out.close();
    }

    static void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int startRow = 0;
        int startCol = 0;
        int targetRow = 0;
        int targetCol = 0;
        char[][] grid = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++){
            String line = next();
            for(int j = 0; j < m; j++){
                grid[i][j] = line.charAt(j);
                if(grid[i][j] == 'A'){
                    startRow = i;
                    startCol = j;
                }
                if(grid[i][j] == 'B'){
                    targetRow = i;
                    targetCol = j;
                }
            }
        }
        
        String ans = bfs(startRow, startCol, targetRow, targetCol, grid, visited);
        if(ans == null){
            out.println("NO");
        } else{
            out.println("YES");
            out.println(ans.length());
            out.println(ans);
        }
    }

    public static String bfs(int sR, int sC, int tR, int tC, char[][] mat, boolean[][] visited){
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {sR, sC});
        visited[sR][sC] = true;
        // parent stores the direction char used to REACH cell (i,j)
        char[][] parent = new char[mat.length][mat[0].length];
        boolean found = false;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int rr = temp[0];
            int cc = temp[1];
            if(rr == tR && cc == tC){
                found = true;
                break;
            }
            for(int i = 0; i < 4; i++){
                int x = rr + di[i];
                int y = cc + dj[i];
                if(x >= 0 && y >= 0 && x < mat.length && y < mat[0].length && !visited[x][y] && mat[x][y] != '#'){
                    q.offer(new int[] {x, y});
                    visited[x][y] = true;
                    parent[x][y] = dirChar[i];
                }
            }
        }
        
        if(!found) return null;

        // Backtrack from target to start to reconstruct the path
        StringBuilder path = new StringBuilder();
        int cr = tR, cc = tC;
        while(cr != sR || cc != sC){
            char d = parent[cr][cc];
            path.append(d);
            // Move backwards: reverse the direction
            if(d == 'D') cr--;
            else if(d == 'U') cr++;
            else if(d == 'R') cc--;
            else if(d == 'L') cc++;
        }
        return path.reverse().toString();
    }

    // ===== Fast I/O =====
    static String next() throws IOException { while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine()); return st.nextToken(); }
    static int nextInt() throws IOException { return Integer.parseInt(next()); }
    static long nextLong() throws IOException { return Long.parseLong(next()); }
    static double nextDouble() throws IOException { return Double.parseDouble(next()); }
    static String nextLine() throws IOException { return br.readLine(); }
    static char nextChar() throws IOException { return next().charAt(0); }

    // ===== Array I/O =====
    static int[] nextIntArray(int n) throws IOException { int[] a = new int[n]; for (int i = 0; i < n; i++) a[i] = nextInt(); return a; }
    static long[] nextLongArray(int n) throws IOException { long[] a = new long[n]; for (int i = 0; i < n; i++) a[i] = nextLong(); return a; }
    static int[][] nextInt2DArray(int r, int c) throws IOException { int[][] a = new int[r][c]; for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = nextInt(); return a; }
    static void printArray(int[] a) { StringBuilder s = new StringBuilder(); for (int i = 0; i < a.length; i++) { if (i > 0) s.append(' '); s.append(a[i]); } out.println(s); }
    static void printArray(long[] a) { StringBuilder s = new StringBuilder(); for (int i = 0; i < a.length; i++) { if (i > 0) s.append(' '); s.append(a[i]); } out.println(s); }

    // ===== Math & Utility =====
    static long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
    static long lcm(long a, long b) { return a / gcd(a, b) * b; }
    static long modPow(long x, long y, long m) { long r = 1; x %= m; while (y > 0) { if ((y & 1) == 1) r = r * x % m; x = x * x % m; y >>= 1; } return r; }
    static long modInv(long x, long m) { return modPow(x, m - 2, m); }
    static int lowerBound(int[] a, int x) { int l = 0, r = a.length; while (l < r) { int m = (l + r) >>> 1; if (a[m] < x) l = m + 1; else r = m; } return l; }
    static int upperBound(int[] a, int x) { int l = 0, r = a.length; while (l < r) { int m = (l + r) >>> 1; if (a[m] <= x) l = m + 1; else r = m; } return l; }
    static void debug(Object... o) { System.err.println(Arrays.deepToString(o)); }
}