class Solution {
    public String removeDigit(String number, char digit) {

        String res = "";

        for(int i=0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                String cnd = number.substring(0,i) + number.substring(i+1);

                if(cnd.compareTo(res) > 0){
                res = cnd;
            }



            }

            
        }

        return res;
        
    }
}