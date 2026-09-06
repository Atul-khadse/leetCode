class Solution {
    public int arraySign(int[] nums) {
        
        int nagative = 0;

          for(int num : nums){
                if(num == 0){
                    return 0;
                }      

                if(num < 0){
                    nagative++;
                }
          }


          if(nagative % 2 != 0){
            return -1;
          }else{
            return 1;
          }


    }
}