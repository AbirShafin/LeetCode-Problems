package codeforcesProblems;
import java.io.*;
import java.util.*;
 
public class helpfulMaths339a {
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
        String s = next();
        int c = 0;
        int[] arr = new int[(s.length()/2)+1];
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){arr[c++] = Character.getNumericValue(s.charAt(i));}
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(i!=arr.length-1){
        System.out.print(arr[i]+"+");
            }
            else{System.out.print(arr[i]);}
        }
    }
}
