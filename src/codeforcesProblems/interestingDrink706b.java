package codeforcesProblems;
import java.io.*;
import java.util.*;
//706B
public class interestingDrink706b {
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
    static int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
    public static void main(String[] args) throws IOException {
        int v1 = nextInt(), a=0;
        int[] arr1 = new int[v1];
        for(int i=v1; i>0; i--){
            arr1[a++] = nextInt();
        }
        Arrays.sort(arr1);
        StringBuilder sb = new StringBuilder();
        
        int v2 = nextInt();
        while(v2-->0){
            int q = nextInt();
            int idx = upperBound(arr1, q);
            sb.append(idx).append("\n");
        }
            System.out.println(sb);
        
        
        }            
}

