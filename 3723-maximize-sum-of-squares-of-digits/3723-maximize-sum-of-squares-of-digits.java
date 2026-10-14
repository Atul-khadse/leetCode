class Solution {
    public String maxSumOfSquares(int num, int sum) {
        

        if (sum > (long) num * 9) {
            return "";
        }


char[] result = new char[num];

for (int i = 0; i < num; i++) {
          
            for (int digit = 9; digit >= 0; digit--) {
               
                if (i == 0 && digit == 0 && num > 1) {
                    continue;
                }
                
              
                int remainingSum = sum - digit;
              
                int remainingDigits = num - 1 - i;
                
               
                if (remainingSum >= 0 && remainingSum <= (long) remainingDigits * 9) {
                    result[i] = (char) (digit + '0'); 
                    sum = remainingSum;             
                    break;                           
                }
            }
        }
        
        return new String(result);


    }
}