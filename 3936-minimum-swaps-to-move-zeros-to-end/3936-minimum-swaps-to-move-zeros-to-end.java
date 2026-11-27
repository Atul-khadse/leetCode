class Solution {
    public int minimumSwaps(int[] nums) {

        // int i=0, j=nums.length-1;
        // int swap = 0;

        // while(i < j){
        //     while(i < j && nums[j] == 0){
        //         j--;
        //     }

        //     if(i < j && nums[i] == 0){
        //         swap++;
        //         j--;
        //     }
        //     i++;
        // }



        // return swap;




int zeros=0, swap=0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            }
        }

        int i = nums.length-1;

        while(zeros > 0){
            if(nums[i] != 0){
                swap++;
            }

            zeros--;
            i--;
        }



       return swap;


        
    }
}