class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // basit bir mantık ile çözlülebilecek bir mantık sorusu 
        long answer=0;
        long numSubarraysInSubstring=0;
        int consecutiveZeros=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                consecutiveZeros++;
                numSubarraysInSubstring +=consecutiveZeros;
            }else{
                    consecutiveZeros =0;
                    answer+=numSubarraysInSubstring;
                    numSubarraysInSubstring=0;
            }
        }
        
        return answer+numSubarraysInSubstring;
    }
}