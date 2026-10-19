class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l=0, r=k,sum=0;
       int maxSum=0;

       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
       maxSum=sum;

       while(r<nums.length){
        sum -= nums[l];
        l++;
        sum += nums[r];
        r++;
        maxSum = Math.max(maxSum,sum);
       }
       return (double) maxSum/k;

    }
}