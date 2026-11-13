class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Har number ki frequency count karo
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxLength = 0;
        
        // Step 2: Har unique number ke liye check karo ki kya (num + 1) exist karta hai
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                int currentLength = map.get(num) + map.get(num + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;

        
    }
}