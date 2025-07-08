/// 02.07.2025
//// Solved but with a hint.
/// The hint was reversing the array.
/// There is one more solution.
/// Hard question.
/// O(N)-> time O(1)->space
class Solution {
    public void rotate(int[] nums, int k) {
        // reverse last part
        int n=nums.length;
        k%=n;
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0, n-1);
    }

        public void reverse(int[]arr,int start,int end){
            while(start<end){
                int temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: [1,2,3,4,5,6,7], k = 3
        System.out.println("=== Test Case 1 ===");
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.print("Input: nums = ");
        printArray(nums1);
        System.out.println(", k = " + k1);
        
        solution.rotate(nums1, k1);
        
        System.out.print("Output: ");
        printArray(nums1);
        System.out.print("Expected: [5,6,7,1,2,3,4]");
        System.out.println("\n");
        
        // Test Case 2: [-1,-100,3,99], k = 2
        System.out.println("=== Test Case 2 ===");
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        System.out.print("Input: nums = ");
        printArray(nums2);
        System.out.println(", k = " + k2);
        
        solution.rotate(nums2, k2);
        
        System.out.print("Output: ");
        printArray(nums2);
        System.out.print("Expected: [3,99,-1,-100]");
        System.out.println("\n");
        
        // Test Case 3: Edge case - k = 0
        System.out.println("=== Test Case 3 (k = 0) ===");
        int[] nums3 = {1, 2, 3};
        int k3 = 0;
        System.out.print("Input: nums = ");
        printArray(nums3);
        System.out.println(", k = " + k3);
        
        solution.rotate(nums3, k3);
        
        System.out.print("Output: ");
        printArray(nums3);
        System.out.print("Expected: [1,2,3]");
        System.out.println("\n");
        
        // Test Case 4: k > nums.length
        System.out.println("=== Test Case 4 (k > length) ===");
        int[] nums4 = {1, 2};
        int k4 = 3;
        System.out.print("Input: nums = ");
        printArray(nums4);
        System.out.println(", k = " + k4);
        
        solution.rotate(nums4, k4);
        
        System.out.print("Output: ");
        printArray(nums4);
        System.out.print("Expected: [2,1]");
        System.out.println("\n");
        
        // Test Case 5: Single element
        System.out.println("=== Test Case 5 (Single element) ===");
        int[] nums5 = {1};
        int k5 = 1;
        System.out.print("Input: nums = ");
        printArray(nums5);
        System.out.println(", k = " + k5);
        
        solution.rotate(nums5, k5);
        
        System.out.print("Output: ");
        printArray(nums5);
        System.out.print("Expected: [1]");
        System.out.println("\n");
    }
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}