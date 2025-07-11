/// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
///You must write an algorithm that runs in O(n) time.
/// MEDIUM-HARD
/// My solution stuck in TLE but performed better in average cases.
/// TIME: O(N) SPACE:O(N)



import java.util.HashSet;


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h= new HashSet<Integer>();
        /// HASHING THE NUMBERS
        for (int num : nums) {
            h.add(num);
        }  
        
        int maxConsecutive=0;
        while(!h.isEmpty()){
            int ctr=0;
            Integer firstKey = null;
            for (Integer key : h) {
                firstKey = key;
                break;
            }
            ctr+=sequenceCalc(-1, h, firstKey-1);
            ctr+=sequenceCalc(1, h, firstKey);
            
            maxConsecutive=Math.max(maxConsecutive, ctr);
        }
        return maxConsecutive; 
        
    }
    /// +1: INCREASING WAY
    /// -1: DECREASING WAY
    public static int sequenceCalc(int way,HashSet <Integer>h,int num){
        int ctr=0;
        while(h.contains(num)){
            ctr++;
            h.remove(num);
            num+=way;
        }
        return ctr;
    }


}
//// ALTERNATIVE STANDARD VERSION
/* class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int longestStreak = 0;
        
        for (int num : numSet) {
            // Sadece sequence'ın başlangıcındaysa işle
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Sequence'ı ileriye doğru say
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
} */