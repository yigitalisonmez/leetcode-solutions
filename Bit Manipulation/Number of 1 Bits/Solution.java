/// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
/// EASY
/// Time:O(n) Space:O(1)
/// I expected that there is a trickier solution.
/// This solution is the trivial soluton but it performs like the others.
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            if(n%2==1)
                c++;
            n/=2;    
        }
        return c;
    }
}