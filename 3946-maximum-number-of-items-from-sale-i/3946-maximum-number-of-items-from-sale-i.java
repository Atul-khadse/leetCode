class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        
        int n = items.length;
        int[] firstcopyvalue = new int[n];

        for(int i=0; i < n; i++){
            int free = 0;
            for(int j=0; j < n; j++){
                if( i != j && items[j][0] % items[i][0] == 0){
                    free++;
                }
            }


            firstcopyvalue[i] = 1+free;
        }


        int[] dp = new int[budget + 1];

        for(int i=0; i < n; i++){
            int price = items[i][1];
            int val = firstcopyvalue[i];
            for(int b = budget; b >= price; b--){
                dp[b] = Math.max(dp[b], dp[b-price] + val);
            }
        }



        for(int i=0; i < n; i++){
            int price = items[i][1];
            for(int b=price; b <= budget; b++){
                dp[b] = Math.max(dp[b], dp[b-price] + 1);
            }
        }



      return dp[budget];






    }
}