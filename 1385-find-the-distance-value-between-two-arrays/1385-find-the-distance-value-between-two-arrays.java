class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int n = arr1.length;
        int count = n;

        for(int n1 : arr1){
            for(int n2 : arr2){
                if(Math.abs(n1 - n2) <= d){
                    count--;
                    break;
                }
            }
        }
        return count;
        
    }
}