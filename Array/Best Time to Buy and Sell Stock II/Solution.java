// Completed EASY

class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit=0;
        int currMin=Integer.MAX_VALUE;
        for (int price : prices) {
            if(price<=currMin){
                currMin=price;
            }else{
                // o zaman satış yapıcam
                totalProfit+=price-currMin;
                currMin=price;
            }
        }
        return totalProfit;
    }
}