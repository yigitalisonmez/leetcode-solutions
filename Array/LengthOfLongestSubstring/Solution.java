package LengthOfLongestSubstring;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    int leftIdx=0;
    int rightIdx=0;
    int currLength=0;
    int maxLength=0;  
    Map<Character, Integer> map = new HashMap<>();

    if (s.length() == 0) return 0;  // Edge case    

    while(rightIdx < s.length()){
        // Control if its in the HashMap
        if(map.containsKey(s.charAt(rightIdx))){
            int lastIdxOfChar= map.get(s.charAt(rightIdx));
            // leftIdx ile lastIdxOfChar arası kalanları yani substring'ten atılan kısmı sildim 
            for (int i = leftIdx; i < lastIdxOfChar+1; i++) {
                map.remove(s.charAt(i));
            }
            // leftIdx güncelledim.
            leftIdx= lastIdxOfChar+1;
            // tekrar eden char'ın son gözükme yerini güncelledim.
            map.put(s.charAt(rightIdx), rightIdx);
        }else{
            map.put(s.charAt(rightIdx), rightIdx);
        }
        // currlength güncelledim
        currLength=rightIdx-leftIdx+1; 
        maxLength = Math.max(maxLength, currLength);
        // rightIDx hep hareket ediyor.
        rightIdx++;
    }

    return maxLength;
    }




     public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("=== LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS ===\n");
        
        // Test Case 1: "abcabcbb"
        String test1 = "abcabcbb";
        int result1 = solution.lengthOfLongestSubstring(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: " + result1 + " (Expected: 3)");
        System.out.println("Explanation: \"abc\" is the longest substring\n");
        
        // Test Case 2: "bbbbb"
        String test2 = "bbbbb";
        int result2 = solution.lengthOfLongestSubstring(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: " + result2 + " (Expected: 1)");
        System.out.println("Explanation: \"b\" is the longest substring\n");
        
        // Test Case 3: "pwwkew"
        String test3 = "pwwkew";
        int result3 = solution.lengthOfLongestSubstring(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Result: " + result3 + " (Expected: 3)");
        System.out.println("Explanation: \"wke\" is the longest substring\n");
        
        // Test Case 4: "" (empty string)
        String test4 = "";
        int result4 = solution.lengthOfLongestSubstring(test4);
        System.out.println("Test 4: \"" + test4 + "\" (empty)");
        System.out.println("Result: " + result4 + " (Expected: 0)\n");
        
        // Test Case 5: "abcdef" (no repeating)
        String test5 = "abcdef";
        int result5 = solution.lengthOfLongestSubstring(test5);
        System.out.println("Test 5: \"" + test5 + "\"");
        System.out.println("Result: " + result5 + " (Expected: 6)\n");
        
        // Test Case 6: "a" (single character)
        String test6 = "a";
        int result6 = solution.lengthOfLongestSubstring(test6);
        System.out.println("Test 6: \"" + test6 + "\"");
        System.out.println("Result: " + result6 + " (Expected: 1)\n");
        
        // Test Case 7: "dvdf"
        String test7 = "dvdf";
        int result7 = solution.lengthOfLongestSubstring(test7);
        System.out.println("Test 7: \"" + test7 + "\"");
        System.out.println("Result: " + result7 + " (Expected: 3)");
        System.out.println("Explanation: \"vdf\" is the longest substring\n");
        
        // Test Case 8: "abba"
        String test8 = "abba";
        int result8 = solution.lengthOfLongestSubstring(test8);
        System.out.println("Test 8: \"" + test8 + "\"");
        System.out.println("Result: " + result8 + " (Expected: 2)");
        System.out.println("Explanation: \"ab\" or \"ba\" is the longest substring\n");
        

    }
}