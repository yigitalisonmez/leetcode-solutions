/// 2 çözümü var biri inplace biri değil in place olan daha hoş tabii ama diğerinin anlaması daha kolay 
/// Önemli olan şey prefix ve postfix mantığını oturtmak.Yani kendinden öncekilerin çarpımı.Kendinden sonrakilerin çarpımı
/// 


import java.util.Arrays;



class Solution {
/*     public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] postfix=new int[nums.length];
        int[] answer=new int[nums.length];
        prefix[0]=1;
        postfix[nums.length-1]=1;
        // prefix
        for (int i = 1; i < nums.length; i++) {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        // postfix
        for (int i = nums.length-2; i >=0; i--) {
            postfix[i]= postfix[i+1]*nums[i+1];
        }
        // answer
        for (int i = 0; i < answer.length; i++) {
            answer[i]=prefix[i]*postfix[i];            
        }
        return answer;
    } */
   public int[] productExceptSelf(int[] nums) {
        int mult=1;
        int[] answer=new int[nums.length];
        Arrays.fill(answer, 1);
        // prefix
        for (int i = 0; i < nums.length; i++) {
            answer[i]=mult*nums[i];
            mult*=nums[i];
        }
        // postfix
        mult=1;
        for (int i = nums.length-1; i >=0; i--) {
            answer[i]= mult*nums[i];
            mult*=nums[i]; 
        }
        return answer;
}
}