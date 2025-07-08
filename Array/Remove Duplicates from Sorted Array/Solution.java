/// ACCEPTED 
/// kolay


import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueCtr=1;
        int duplicateCtr=0;
        int lastUniqueNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(lastUniqueNumber==nums[i]){
                duplicateCtr++;
            }else{
                // unique num found
                // swap
                uniqueCtr++;
                lastUniqueNumber = nums[i];
                nums[i-duplicateCtr]=lastUniqueNumber;
            }
        }
        return uniqueCtr;
    }

     public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("=== REMOVE DUPLICATES TEST CASES ===\n");
        
        // Test Case 1: [1,1,2]
        int[] test1 = {1, 1, 2};
        System.out.println("Test 1: " + Arrays.toString(test1.clone()));
        int result1 = solution.removeDuplicates(test1);
        System.out.println("Result: k = " + result1);
        System.out.print("Modified array: ");
        for (int i = 0; i < result1; i++) {
            System.out.print(test1[i] + " ");
        }
        System.out.print("(rest: ");
        for (int i = result1; i < test1.length; i++) {
            System.out.print("_ ");
        }
        System.out.println(")");
        System.out.println("Expected: k = 2, array = [1, 2, _]\n");
        
        // Test Case 2: [0,0,1,1,1,2,2,3,3,4]
        int[] test2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Test 2: " + Arrays.toString(test2.clone()));
        int result2 = solution.removeDuplicates(test2);
        System.out.println("Result: k = " + result2);
        System.out.print("Modified array: ");
        for (int i = 0; i < result2; i++) {
            System.out.print(test2[i] + " ");
        }
        System.out.print("(rest: ");
        for (int i = result2; i < test2.length; i++) {
            System.out.print("_ ");
        }
        System.out.println(")");
        System.out.println("Expected: k = 5, array = [0, 1, 2, 3, 4, _, _, _, _, _]\n");
        
        // Test Case 3: All same elements
        int[] test3 = {1, 1, 1, 1};
        System.out.println("Test 3: " + Arrays.toString(test3.clone()));
        int result3 = solution.removeDuplicates(test3);
        System.out.println("Result: k = " + result3);
        System.out.print("Modified array: ");
        for (int i = 0; i < result3; i++) {
            System.out.print(test3[i] + " ");
        }
        System.out.println();
        System.out.println("Expected: k = 1, array = [1, _, _, _]\n");
        
        // Test Case 4: No duplicates
        int[] test4 = {1, 2, 3, 4, 5};
        System.out.println("Test 4: " + Arrays.toString(test4.clone()));
        int result4 = solution.removeDuplicates(test4);
        System.out.println("Result: k = " + result4);
        System.out.println("Modified array: " + Arrays.toString(test4));
        System.out.println("Expected: k = 5, array = [1, 2, 3, 4, 5]\n");
        
        // Test Case 5: Single element
        int[] test5 = {1};
        System.out.println("Test 5: " + Arrays.toString(test5.clone()));
        int result5 = solution.removeDuplicates(test5);
        System.out.println("Result: k = " + result5);
        System.out.println("Modified array: " + Arrays.toString(test5));
        System.out.println("Expected: k = 1, array = [1]\n");
        
        // Test Case 6: Two elements - same
        int[] test6 = {2, 2};
        System.out.println("Test 6: " + Arrays.toString(test6.clone()));
        int result6 = solution.removeDuplicates(test6);
        System.out.println("Result: k = " + result6);
        System.out.print("Modified array: ");
        for (int i = 0; i < result6; i++) {
            System.out.print(test6[i] + " ");
        }
        System.out.println();
        System.out.println("Expected: k = 1, array = [2, _]\n");
        
        // Test Case 7: Two elements - different
        int[] test7 = {1, 2};
        System.out.println("Test 7: " + Arrays.toString(test7.clone()));
        int result7 = solution.removeDuplicates(test7);
        System.out.println("Result: k = " + result7);
        System.out.println("Modified array: " + Arrays.toString(test7));
        System.out.println("Expected: k = 2, array = [1, 2]\n");

        
    }
}