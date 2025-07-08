class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx1=m-1;
        int idx2=n-1;
        for (int i = 0; i < m+n; i++) {
            if(nums1[idx1]>=nums2[idx2]){
                nums1[m+n-1-i]=nums1[idx1];
                idx1--;
            }else
                nums1[m+n-1-i]=nums2[idx2];
                idx2--;
        }
        
    }
}