class Solution {
    public int smallestDistancePair(int[] nums, int k) {
       Arrays.sort(nums);

        int n= nums.length;
       int l=0;
       int r= nums[n-1] - nums[0];

       while(l<r){
        int mid = l+(r-l)/2;

        if(countPair(nums,mid) >= k){
            r=mid;
        }else{
            l=mid+1;
        }

       }
        return l;
        
    }


    private int countPair(int[] nums, int targerDistance){
        int left=0;
        int count=0;

        for(int right=0; right< nums.length; right++){

            while(nums[right] - nums[left] > targerDistance){
                left++;
            }


            count += right-left;


        }

        return count;
    }
}