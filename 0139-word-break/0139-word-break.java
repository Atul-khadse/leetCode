class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> hashSet = new HashSet<>(wordDict);

        int n = s.length();

        int maxL = 0;

        for(String word : hashSet){
            maxL = Math.max(maxL, word.length());
        }


 boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for(int i=1; i<=n; i++){
            for(int j = Math.max( 0,i - maxL); j < i; j++){
                if(dp[j] && hashSet.contains(s.substring(j, i))){
                     dp[i] = true;
                    break;
                }
            }
        }


        return dp[n];


        
    }
}