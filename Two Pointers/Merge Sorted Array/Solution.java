/* 
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/
/// EASY
/// Time O(m+n) Space:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length-1; i >=0 ; i--) {
            if( m>=0&& n>=0 ){
                if(nums1[m]>nums2[n]){
                    nums1[i]=nums1[m];
                    m--;
                }
                else{
                    nums1[i]=nums2[n];
                    n--;
                }

            }else{
                if(m>=0){
                    nums1[i]=nums1[m];
                    m--;
                }else{
                    nums1[i]=nums2[n];
                    n--;
                }
            }
        }
    }
       public static void main(String[] args) {
       Solution solution = new Solution();
       
       // Example 1
       int[] nums1_1 = {1, 2, 3, 0, 0, 0};
       int m1 = 3;
       int[] nums2_1 = {2, 5, 6};
       int n1 = 3;
       
       System.out.println("Example 1:");
       System.out.print("Before: nums1 = ");
       printArray(nums1_1);
       solution.merge(nums1_1, m1, nums2_1, n1);
       System.out.print("After:  nums1 = ");
       printArray(nums1_1);
       System.out.println();
       
       // Example 2
       int[] nums1_2 = {1};
       int m2 = 1;
       int[] nums2_2 = {};
       int n2 = 0;
       
       System.out.println("Example 2:");
       System.out.print("Before: nums1 = ");
       printArray(nums1_2);
       solution.merge(nums1_2, m2, nums2_2, n2);
       System.out.print("After:  nums1 = ");
       printArray(nums1_2);
       System.out.println();
       
       // Example 3
       int[] nums1_3 = {0};
       int m3 = 0;
       int[] nums2_3 = {1};
       int n3 = 1;
       
       System.out.println("Example 3:");
       System.out.print("Before: nums1 = ");
       printArray(nums1_3);
       solution.merge(nums1_3, m3, nums2_3, n3);
       System.out.print("After:  nums1 = ");
       printArray(nums1_3);
   }
   
   private static void printArray(int[] arr) {
       System.out.print("[");
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
           if (i < arr.length - 1) {
               System.out.print(", ");
           }
       }
       System.out.println("]");
   }
}