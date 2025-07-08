public class Solution {
    public boolean increasingTriplet(int[] nums) {
        // BASE CASE
        if(nums.length<3)
            return false;
        if(nums.length==3 ){
            if(nums[0]<nums[1] && nums[1]<nums[2])
                return true;
            return false;       
        }    
            
        int sumNums=0;
        int max=nums[nums.length-1];
        int min= nums[0];

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]<=min){
                min=nums[i];
                sumNums--;

            }else{
                sumNums++;
            }
            
        }
        
        for (int i = nums.length-2; i >0 ; i--) {
            if(nums[i]>=max){
                max=nums[i];
                sumNums--;

            }else{
                sumNums++;
            }
        }

        return sumNums>0;// UNIMPLEMENTED
        
    }
    
}