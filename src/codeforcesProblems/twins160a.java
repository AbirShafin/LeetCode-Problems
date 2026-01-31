package codeforcesProblems;
import java.io.*;
import java.util.*;

public class twins160a{
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
        int v1 = nextInt(), sum = 0;
        int[] arr1 = new int[v1];
        for(int i = 0; i<v1; i++){
            arr1[i] = nextInt();
        }
        Arrays.sort(arr1);
        for(int elem : arr1){
            sum+= elem;
        }
        sum = sum/2;
        int temp = 0, count = 0;
        for(int i=v1-1; i>=0; i--){
            temp += arr1[i];
            count++;
            if(temp>sum){break;}
        }
        System.out.print(count);
        }
    }
