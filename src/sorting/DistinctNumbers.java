package sorting;

import java.io.*;
import java.util.*;

public class DistinctNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        Set<Integer> set = new HashSet<>();
        for (String s : line) {
            set.add(Integer.parseInt(s));
        }
        
        out.println(set.size());
        out.flush();
    }
}
