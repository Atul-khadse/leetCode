class Solution {
    public int minAddToMakeValid(String s) {
        int openB=0, closeB=0;
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == '('){
             openB++;
           }else {

            if(openB > 0){
                openB--;
            }else{
                closeB++;
            }
            
           }
        }

        return openB + closeB;

       


        
    }
}