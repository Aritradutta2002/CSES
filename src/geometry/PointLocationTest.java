package geometry;

import java.io.*;
import java.util.*;

public class PointLocationTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            String[] p1 = br.readLine().split(" ");
            String[] p2 = br.readLine().split(" ");
            String[] p3 = br.readLine().split(" ");
            
            long x1 = Long.parseLong(p1[0]), y1 = Long.parseLong(p1[1]);
            long x2 = Long.parseLong(p2[0]), y2 = Long.parseLong(p2[1]);
            long x3 = Long.parseLong(p3[0]), y3 = Long.parseLong(p3[1]);
            
            long cross = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
            
            if (cross > 0) out.println("LEFT");
            else if (cross < 0) out.println("RIGHT");
            else out.println("TOUCH");
        }
        
        out.flush();
    }
}
