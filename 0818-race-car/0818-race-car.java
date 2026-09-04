class Solution {
    public int racecar(int target) {
        int[] dp = new int[target + 1];
        
       
        int n = 1;
        
        for (int i = 1; i <= target; i++) {
           
            if (i == (1 << n) - 1) {
                dp[i] = n;
                n++; 
            } else {
                
                dp[i] = Integer.MAX_VALUE;
                
              
                for (int j = 0; j < n - 1; j++) {
                    int backwardDistance = (1 << (n - 1)) - (1 << j);
                    dp[i] = Math.min(dp[i], (n - 1) + 1 + j + 1 + dp[i - backwardDistance]);
                }
                
               
                int forwardOvershoot = (1 << n) - 1;
                dp[i] = Math.min(dp[i], n + 1 + dp[forwardOvershoot - i]);
            }
        }
        
        return dp[target];
    }
}
