class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         if (n <= 0) return true;
        
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
           
            if (flowerbed[i] == 0) {
                
                
                boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0);
                
                
                boolean nextEmpty = (i == length - 1 || flowerbed[i + 1] == 0);
              
                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1;
                    n--;              
                    
                   
                    if (n <= 0) {
                        return true;
                    }
                }
            }
        }
        
       
        return n <= 0;
    }
    }
