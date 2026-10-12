class Solution {
    public int maxSum(List<Integer> nums, int k) {
        


         long MOD = 1_000_000_007L;
        
       
        int[] bitCount = new int[30];
        
        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        
        long totalSumOfSquares = 0;
        
      
        for (int i = 0; i < k; i++) {
            long currentMaxNum = 0;
            
           
            for (int bit = 0; bit < 30; bit++) {
                if (bitCount[bit] > 0) {
                    currentMaxNum |= (1 << bit); 
                    bitCount[bit]--;            
                }
            }
            
            
            long square = (currentMaxNum * currentMaxNum) % MOD;
            totalSumOfSquares = (totalSumOfSquares + square) % MOD;
        }
        
        return (int) totalSumOfSquares;




    }
}