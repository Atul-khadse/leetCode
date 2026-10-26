class Solution {
    public int countIslands(int[][] grid, int k) {
        int r = grid.length, c = grid[0].length;
        int ans = 0;
        for(int i=0; i< r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] > 0){
                    long s = dfs(grid, i,j);
                    if(s % k == 0) ans++;
                }
            }
        }

        return ans;

    }


    private long dfs(int[][] grid, int i, int j){

        int r = grid.length, c = grid[0].length;
        if(i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0 ) return 0;

        long sum = grid[i][j];
        grid[i][j] = 0;
        sum += dfs(grid, i+1,j);
        sum += dfs(grid, i-1, j);
        sum += dfs(grid, i, j+1);
        sum += dfs(grid, i, j-1);
        return sum;

    }
}