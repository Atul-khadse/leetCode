class Solution {
    public int longestSubarray(int[] nums) {
        

        int res=0;
        int zero=0;
        int l=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0) zero++;

            if(zero > 1){
                if(nums[l] == 0) zero--;
                l++;

            }

            res = Math.max(res, i-l);
        }



        return res;

    }
}