class Solution {
    int[] DIRS = {0, 1, 0, -1, 0};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        

        if(image[sr][sc] == color) return image;


        int m=image.length, n = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});

        int oldColor = image[sr][sc];
        image[sr][sc] = color;

        while(!q.isEmpty()){
            int[] top = q.poll();
            for(int i = 0; i< 4; i++){
                int nr = top[0] + DIRS[i];
                int nc = top[1] + DIRS[i+1];
                if(nr < 0 || nr == m || nc < 0 || nc == n || image[nr][nc] != oldColor) continue;
                image[nr][nc]  = color;
                q.offer(new int[]{nr, nc});
            }

        }

        return image;





    }
}