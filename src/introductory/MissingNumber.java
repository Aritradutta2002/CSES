package introductory;

import java.io.*;
import java.util.*;

public class MissingNumber {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        long sum = (long) n * (n + 1) / 2;
        for (String s : line) {
            sum -= Long.parseLong(s);
        }
        
        out.println(sum);
        out.flush();
    }
}
