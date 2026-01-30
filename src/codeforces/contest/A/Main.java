// package codeforces.contest.A;

import java.io.*;
import java.util.*;
//327A
public class Main {
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
        int n = nextInt();
        int ones = 0;
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int x = nextInt();
            if(x==1){
                ones++;
                x=-1;
            }
            else{
                x = 1;
            }
            cur = Math.max(x, cur+x);
            max = Math.max(cur, max);
        }
        System.out.println(ones+max);
        }            
}
        
    

