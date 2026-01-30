// package codeforces.contest.B;

import java.io.*;
import java.util.*;
//706B
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
        int v1 = nextInt(), a=0;
        int[] arr1 = new int[v1];
        for(int i=v1; i>0; i--){
            arr1[a++] = nextInt();
        }
        a=0;
        int v2 = nextInt();
        int[] arr2 = new int[v2];
        for(int i=v2; i>0; i--){
            arr2[a++] = nextInt();
        }
        int count = 0;
        for(int i=0; i<v2; i++){
            count = 0;
            for(int j=0; j<v1; j++){
                if(arr2[i]>=arr1[j]){count++;}
            }
            System.out.println(count);
        }
        }            
}
