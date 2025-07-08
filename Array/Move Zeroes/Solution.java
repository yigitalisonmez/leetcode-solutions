class Solution {
    public void moveZeroes(int[] nums) {
        // to indicate it is real or 
        int numOfZeroesBefore=0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==0){
                numOfZeroesBefore++;
            }else if(numOfZeroesBefore!=0){
                nums[i-numOfZeroesBefore]=nums[i];
                nums[i]=0; 
            }
     }   
    }
}