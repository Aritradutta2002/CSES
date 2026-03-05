package range;

import java.io.*;
import java.util.*;

public class StaticRangeSumQueries {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        
        String[] arr = br.readLine().split(" ");
        long[] prefix = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + Long.parseLong(arr[i]);
        }
        
        for (int i = 0; i < q; i++) {
            String[] query = br.readLine().split(" ");
            int a = Integer.parseInt(query[0]);
            int b = Integer.parseInt(query[1]);
            out.println(prefix[b] - prefix[a - 1]);
        }
        
        out.flush();
    }
}
