package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class wrongSubtraction977a {
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
        int v1 = nextInt();
        int v2 = nextInt();
        for(int i=v2; i>0; i--){
            if((v1%10!=0)){v1= v1-1;}
            else{v1=v1/10;}
        }
        System.out.print(v1);
        
        
        }
    }

