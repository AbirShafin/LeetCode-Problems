package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class dragons230a{
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
        int v2 = nextInt(), v3,v4, n = 0;
        int[] dS = new int[v2];
        int[] dB = new int[v2];
        for(int i=v2; i>0; i--){
        
        v3 = nextInt();
        v4 = nextInt();
        
        dS[n] = v3;
        dB[n] = v4;
        n++;
        }
        int m = dB.length;
        Integer[] idx = new Integer[m];
        for (int i = 0; i < m; i++) idx[i] = i;
        Arrays.sort(idx, (i, j) -> Integer.compare(dS[i], dS[j]));
 
        for(int i=0; i<v2; i++){
        if(v1>dS[idx[i]]){v1 = v1+dB[idx[i]];}
        else{v1 = -1;
        break;
        }
        }
        if(v1>=0){System.out.print("YES");}
        else{System.out.print("NO");}
        }
    }