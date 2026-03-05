package dp;

import java.io.*;
import java.util.*;

public class DiceCombinations {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int MOD = 1000000007;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6 && j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }
        
        out.println(dp[n]);
        out.flush();
    }
}
