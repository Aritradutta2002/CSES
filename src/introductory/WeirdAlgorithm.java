package introductory;

import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());
        
        out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            out.print(" " + n);
        }
        out.println();
        out.flush();
    }
}
