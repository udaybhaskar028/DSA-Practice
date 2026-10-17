class Solution {
    private void dfs(ArrayList<ArrayList<Integer>> adj,int u, boolean visited[]){
        visited[u]=true;

        for(int v:adj.get(u)){
            if(visited[v]== false){
                dfs(adj,v,visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                if( isConnected[i][j]== 1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);

                }
            }
        }
        boolean visited[] = new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i] != true){
                dfs(adj,i,visited);
                count++;
            }
        }
        return count;
    }
}