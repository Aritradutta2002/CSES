package math;

import java.io.*;
import java.util.*;

public class JosephusQueries {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int q = Integer.parseInt(br.readLine());
        
        while (q-- > 0) {
            String[] line = br.readLine().split(" ");
            long n = Long.parseLong(line[0]);
            long k = Long.parseLong(line[1]);
            out.println(solve(n, k));
        }
        
        out.flush();
    }
    
    static long solve(long n, long k) {
        if (n == 1) return 1;
        if (k <= (n + 1) / 2) {
            if (2 * k > n) return (2 * k) % n;
            else return 2 * k;
        }
        long temp = solve(n / 2, k - (n + 1) / 2);
        if (n % 2 == 1) return 2 * temp + 1;
        return 2 * temp - 1;
    }
}
