package codeforces.contest.templates;

public class binarySearch {
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
}
