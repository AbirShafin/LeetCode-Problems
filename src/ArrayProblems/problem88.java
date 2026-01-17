package ArrayProblems;

public class problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0, q = 0;
        for(int i=0;i<m+n;i++){
            if(nums1[p]==0){
                nums1[p] = nums2[q++];
            }
            else if(nums1[p]<=nums2[q]){
                p++;
            }
            else if(nums1[p]>nums2[q]){
                int temp = nums1[p];
                nums1[p] = nums2[q];
                nums2[q] = temp;
            }
        }
    }
}
