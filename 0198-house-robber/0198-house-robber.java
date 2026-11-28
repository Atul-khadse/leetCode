class Solution {
    public int rob(int[] nums) {



    int rob=0, norob=0;

    for(int i=0; i < nums.length; i++){
        int newRob = norob + nums[i];
        int newnoRob = Math.max(rob, norob);
        rob = newRob;
        norob = newnoRob;
    }


    return Math.max(rob, norob);
        
    }
}