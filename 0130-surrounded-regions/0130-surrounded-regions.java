class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        

        int row = board.length;
        int col = board[0].length;

        Queue<int[]> q = new LinkedList<>();
        

        for(int r=0; r < row; r++){
            for(int c=0; c < col; c++){
                if(r == 0 || r == row - 1 || c == 0 || c == col - 1 ){
                if(board[r][c] == 'O'){
                    board[r][c] = 'E';
                    q.offer(new int[]{r,c});
                }
                }
            }
        }


        int[][] direction = {{1, 0}, {-1, 0}, {0 , -1}, {0, 1}};


        while(!q.isEmpty()){

            int[] curr = q.poll();

            int currRow = curr[0];
            int currCol = curr[1];

            for(int[] dir : direction){
                int nextRow = currRow + dir[0];
                int nextCol = currCol + dir[1];

                if(nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col && board[nextRow][nextCol] == 'O' ){
                    board[nextRow][nextCol] = 'E';
                    q.offer(new int[]{nextRow, nextCol});
                }


            }



        }



        for(int r=0; r < row; r++){
            for(int c=0; c < col; c++){
                if(board[r][c] == 'O'){
                    board[r][c] = 'X';
                }else if(board[r][c] == 'E'){
                    board[r][c] = 'O';
                }
            }
        }







    }
}