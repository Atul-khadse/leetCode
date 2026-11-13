class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
         int n = nums.length;
        long validSubarrays = 0;
        long ops = 0; // Current window me lagne wale total operations
        
        // Deque store karega indices in strictly decreasing order of their values
        Deque<Integer> dq = new ArrayDeque<>();
        
        int j = n - 1; // Right pointer of the window
        
        // Left pointer 'i' ko right-to-left move karke window expand karenge
        for (int i = n - 1; i >= 0; i--) {
            
            // Step 1: Jab tak deque ke front par nums[i] se chote elements hain,
            // nums[i] un sabhi ko apne barabar (nums[i]) utha lega!
            while (!dq.isEmpty() && nums[dq.peekFirst()] < nums[i]) {
                int currIdx = dq.pollFirst();
                // Yeh element kitne elements ko control kar raha tha?
                int nextIdx = dq.isEmpty() ? j + 1 : dq.peekFirst();
                long count = nextIdx - currIdx;
                
                // Sabhi ko nums[i] tak uthane ke liye extra operations add karo
                ops += count * (long) (nums[i] - nums[currIdx]);
            }
            
            // Current index ko deque ke front par daal do
            dq.addFirst(i);
            
            // Step 2: Agar operations 'k' se zyada ho gaye, toh right side (j) se window shrink karo
            while (ops > k) {
                // Deque ke back par sabse bada controller element baitha hai jo 'j' ko control kar raha hai
                int maxIdxInWindow = dq.peekLast();
                
                // 'j' ko bahar nikaalne par kitne operations bach jayenge?
                ops -= (long) (nums[maxIdxInWindow] - nums[j]);
                
                // Agar j khud wahi controller index tha, toh use deque se bhi hata do
                if (maxIdxInWindow == j) {
                    dq.pollLast();
                }
                j--; // Right boundary shrink ki
            }
            
            // Step 3: 'i' se shuru hokar 'j' tak ke saare subarrays ab valid hain!
            validSubarrays += (j - i + 1);
        }
        
        return validSubarrays;
        
    }
}