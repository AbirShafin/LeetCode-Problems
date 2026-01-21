package ArrayProblems;
//Question: 
// Given an array of integers nums, sort the array in ascending order and return it.

// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

// Example 1:

// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
// Example 2:

// Input: nums = [5,1,1,2,0,0]
// Output: [0,0,1,1,2,5]
// Explanation: Note that the values of nums are not necessarily unique.
 
// Constraints:
// 1 <= nums.length <= 5 * 104
// -5 * 104 <= nums[i] <= 5 * 104

public class problem912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    private void mergeSort(int[] nums, int l, int r){
        if(l<r){
        int mid = (l+r)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
        }
    }
    private void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i=0; i<n1; i++) a1[i] = arr[l+i];
        for(int j=0; j<n2; j++ ) a2[j] = arr[m+j+1];

        int i = 0, j= 0, k=l;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                arr[k++] = a1[i++];
            }
            else{
                arr[k++] = a2[j++];
            }
        }
        while(i<n1){arr[k++] = a1[i++];}
        while(j<n2){arr[k++] = a2[j++];}
    }

}
