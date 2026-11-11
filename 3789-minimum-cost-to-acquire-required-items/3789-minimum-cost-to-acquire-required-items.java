class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        long max=Long.MAX_VALUE;

        long c1 = cost1;
        long c2 = cost2;
        long cBoth = costBoth;
        long n1 = need1;
        long n2 = need2;


        long costA = (c1 * n1) + (c2 * n2);
        max = Math.min(max, costA);

        long minNeed = Math.min(n1, n2);
        long costB = (minNeed * cBoth) + ((n1 - minNeed) * c1) + ((n2 - minNeed) * c2);

        max = Math.min(max, costB);


        long maxNeed = Math.max(n1, n2);
        long costC = (maxNeed * cBoth);

        max = Math.min(max, costC);




return max;

    }
}