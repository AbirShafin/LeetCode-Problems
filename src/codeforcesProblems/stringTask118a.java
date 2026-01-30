package codeforcesProblems;
import java.io.*;
import java.util.*;

public class stringTask118a {
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
        String v1 = next();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<v1.length(); i++){
            char ch = v1.charAt(i);
            if("AEIOUYaeiouy".indexOf(ch)==-1){
                sb.append(".");
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
        }
    }
