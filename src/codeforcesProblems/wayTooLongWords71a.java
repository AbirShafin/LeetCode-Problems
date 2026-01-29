package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class wayTooLongWords71a {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
 
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    static String nextLine() throws IOException {
        return br.readLine();
    }
 
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        
        while (t-- > 0) {
            String n = next();
            if(n.length()>10){
                char a = n.charAt(0), b = n.charAt(n.length()-1);
                int z = n.length()-2;
                String c = a + Integer.toString(z) + (b);
                System.out.println(c);
            }
            else{System.out.println(n);}
        }
    }
}

