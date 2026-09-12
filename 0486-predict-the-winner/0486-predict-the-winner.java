class Solution {
    public boolean predictTheWinner(int[] nums) {
        

        return getNetScore(nums, 0, nums.length - 1) >= 0;
    }


    private int getNetScore(int[] nums, int start, int end){
        if(start == end){
            return nums[start];
        }


        int pickLeft  = nums[start] - getNetScore(nums,start+1, end);

        int pickRight = nums[end] - getNetScore(nums, start, end-1);

        return Math.max(pickLeft, pickRight);
    }
}