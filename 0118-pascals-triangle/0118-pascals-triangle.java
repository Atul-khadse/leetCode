class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> traingel = new ArrayList<>();


        for(int i =0 ; i<numRows; i++){

            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{

                int leftAbove = traingel.get(i-1).get(j-1);
                int rightAbove = traingel.get(i-1).get(j);
                row.add(leftAbove + rightAbove);
                }
                
            }

            traingel.add(row);
        }

        return traingel;
        
    }
}