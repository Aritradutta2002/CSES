package string;

import java.io.*;
import java.util.*;

public class WordCombinations {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int MOD = 1000000007;
    
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        
        Set<String> words = new HashSet<>();
        for (int i = 0; i < k; i++) {
            words.add(br.readLine());
        }
        
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) continue;
            for (int j = i + 1; j <= n; j++) {
                if (words.contains(s.substring(i, j))) {
                    dp[j] = (dp[j] + dp[i]) % MOD;
                }
            }
        }
        
        out.println(dp[n]);
        out.flush();
    }
}
