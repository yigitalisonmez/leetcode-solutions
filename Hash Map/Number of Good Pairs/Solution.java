///Given an array of integers nums, return the number of good pairs.
///A pair (i, j) is called good if nums[i] == nums[j] and i < j.
/// EASY
/// TIME:O(N) SPACE:O(N)
/// Every hash table match gives extra pair.For example if you have 3 1's forth 1 gives you extra 3 pairs. 
/// This pattern gives enough information tgo solve the problem.

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for (int i : nums) {
            if(h.containsKey(i)){
                int count=h.get(i);
                ans+=count;
                count++;
                h.put(i, count);

            }else{
                h.put(i, 1);
            }
        }
        return ans; 
    }
}