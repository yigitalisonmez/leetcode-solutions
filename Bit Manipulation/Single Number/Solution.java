///Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
///You must implement a solution with a linear runtime complexity and use only constant extra space.

// Since it is classified as bit manipulation problem. I will try XOR.
// IF we try to xor the number n ,two times, same number n will occur. So the one number that does not show twice will be distiguished. 
/// Time:O(n) Space:O(1)
/// ACCEPTED
class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for (int i : nums) {
            n=n^i;
        }
        return n;
    }
}