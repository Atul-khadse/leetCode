class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
    int l=0, r = height.length-1;
        while(l < r){
            int w = r-l;
            int h = Math.min(height[l],height[r]);
            int currentArea = w*h;
            maxWater = Math.max(maxWater, currentArea);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        
        return maxWater;
    }
}