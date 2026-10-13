class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n=nums.length;
        long[] s = new long[n];

        for(int i=0; i<n; i++){
            s[i] = (long) nums[i]*nums[i];
        }

        Arrays.sort(s);

        long maxS=0;
        int minusC= n/2;

        for(int i=0;i<n; i++){
            if(i < minusC){
                maxS -= s[i];
            }else{
                maxS += s[i];
            }
        }
        

        return maxS;
    }
}