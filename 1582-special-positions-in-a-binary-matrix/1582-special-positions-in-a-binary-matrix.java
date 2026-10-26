class Solution {
    public int numSpecial(int[][] mat) {
        int[] rowCount = new int[mat.length];
        int[] colCount = new int[mat[0].length]; 

        Arrays.fill(rowCount,0);
        Arrays.fill(colCount,0);

        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                if(mat[row][col] == 1){
                    rowCount[row]++;
                    colCount[col]++;

                }
            }
        }
        int result = 0;

        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                if(mat[row][col]==0)continue;
                else{
                    if(rowCount[row] == 1 && colCount[col] == 1){
                        result++;
                    }
                }
            }
        }
        return result;
        
    }
}