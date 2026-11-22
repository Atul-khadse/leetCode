class Solution {
    public boolean checkString(String s) {

        boolean seeB = false;
        for(char c : s.toCharArray()){
            if(c == 'b'){
                seeB = true;
            }else  if(seeB){
                return false;
            }
        }


        return true;
        
    }
}