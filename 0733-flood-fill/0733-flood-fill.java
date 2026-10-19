class Solution {
private void dfs(int row, int col,int[][] ans, int[][] image,int inicolour, int newcolour, int n,int m){
    
    if (row < 0 || row >= m || col < 0 || col >= n || image[row][col] != inicolour) {
        return;                 // water '0' OR visited '#': both stop here
    }
    ans[row][col] = newcolour;
    dfs(row + 1, col,ans,image ,inicolour,newcolour, n,m);
    dfs(row - 1, col,ans,image ,inicolour,newcolour, n,m);
    dfs(row, col + 1,ans,image ,inicolour,newcolour, n,m);
    dfs(row, col - 1,ans,image, inicolour,newcolour, n,m);

}

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int inicolour = image[sr][sc];
        if (inicolour == color) return image;
        int[][] ans = image;
        int m = image.length;
        int n=image[0].length;
        dfs(sr,sc,ans,image,inicolour,color,n,m);
        return ans;
        
    }
}