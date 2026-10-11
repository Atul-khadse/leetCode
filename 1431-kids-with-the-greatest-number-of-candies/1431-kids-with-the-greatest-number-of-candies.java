class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();

        int maxC=0;
        for(int i=0; i<candies.length; i++){
            maxC = Math.max(maxC, candies[i]);
        }

        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies) >= maxC){
                list.add(true);
            } else{
                list.add(false);
            }
        }


        return list;
        
    }
}