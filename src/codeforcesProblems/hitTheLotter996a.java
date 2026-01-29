package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class hitTheLotter996a {
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
        int count = 0;
        while(v1!=0){
        if(v1>=100){v1-=100;
        count++;}
        else if(v1>=20){v1-=20;
        count++;}
        else if(v1>=10){v1-=10;
        count++;}
        else if(v1>=5){v1-=5;
        count++;}
        else if(v1>=1){v1-=1;
            count++;
        }
    }
        System.out.print(count);
        }
    }
