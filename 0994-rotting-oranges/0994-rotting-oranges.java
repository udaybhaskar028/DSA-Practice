class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new ArrayDeque<>();
        int freshCount = 0;
        for(int i = 0;i<m;i++){
            for(int j=0 ;j<n ; j++){
                if(grid[i][j] == 2){
                    int[] rotten = {i,j};
                    queue.add(rotten);
                }
                else if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }      
        if(freshCount ==0){
            return 0 ;
        }  
        int minutes =0;

        while(!queue.isEmpty()){
            int N = queue.size();

            for( int k=0; k<N ;k++){
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];
                for(int[] dir : directions){
                    int newI = i+dir[0];
                    int newJ = j+dir[1];
                    
                    if(newI >=0 && newI < m && newJ < n && newJ >=0 && grid[newI][newJ] == 1){
                        grid[newI][newJ] = 2;
                        int[] next = {newI , newJ};
                        queue.add(next);
                        freshCount --;
                    }
                }
            }
            minutes ++;
        }
        if(freshCount ==0){
            return(minutes -1);
        }
        return -1;
    }
}