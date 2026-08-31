class Solution {

public void dfs(char[][] grid,int i,int j,int r,int c){
    if(i<0 || j<0 || i>=r || j>= c || grid[i][j] != '1'){
        return;
    }

    if(grid[i][j] == '1'){
        grid[i][j] = '0';
        dfs(grid,i,j-1,r,c);//left
        dfs(grid,i,j+1,r,c);//right
        dfs(grid,i-1,j,r,c);//up
        dfs(grid,i+1,j,r,c);//down
    }
}
    public int numIslands(char[][] grid) {
        

        int r = grid.length;
        int c = grid[0].length;
        int count =0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] == '1'){
                    count++;
                dfs(grid,i,j,r,c);
                }
            }
        }

        return count;
    }
}