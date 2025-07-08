/// COMPLETED
/// Will be solved by dynamic programming techniques
/// 01.07.2025
/// Solved with a normal technique
/// with dynamic programming O(n2)
/// but with normal solution O(n)


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currMin=prices[0];
        for (int i : prices) {
            if(prices[i]<currMin){
                currMin=prices[i];
            }else{
                maxProfit=Math.max(maxProfit, prices[i]-currMin);
            }   
        }
        return maxProfit;
        
    }
}