class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;


        for(int p=0; p< nums.length; p++){
            if(nums[p] <= i){
                i = nums[p];

            }else if(nums[p] <= j){
                j = nums[p];
            }else{
                return true;
            }
        }


        return false;



    }
}