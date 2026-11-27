class Solution {
    public int minimumSwaps(int[] nums) {

        int i=0, j=nums.length-1;
        int swap = 0;

        while(i < j){
            while(i < j && nums[j] == 0){
                j--;
            }

            if(i < j && nums[i] == 0){
                swap++;
                j--;
            }
            i++;
        }



        return swap;
        
    }
}