package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class watermelon4a {
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
 
    public static void main(String[] args) throws Exception {
      
        int t = nextInt();
        
        if(t>2 && t%2==0){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}