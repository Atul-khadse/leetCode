class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i=0; i < n; i++){

            if(dp[i] == Integer.MAX_VALUE) continue;


            for(int jump=1; jump <= 3; jump++){

                int j = i + jump; 

                if(j <= n){

                    int currCost = costs[j-1] + (jump * jump);

                    dp[j] = Math.min(dp[j] , dp[i] + currCost);
                }
            }


        }

        return dp[n];
        
    }
}