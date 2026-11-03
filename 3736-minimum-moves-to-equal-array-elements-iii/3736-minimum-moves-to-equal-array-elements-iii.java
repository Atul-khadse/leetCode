class Solution {
    public int minMoves(int[] nums) {
         int mn = Integer.MIN_VALUE;
        for (int x : nums) if (x > mn) mn = x;
        long moves = 0;
        for (int x : nums) moves += mn - x;
        return (int) moves;
    }
}