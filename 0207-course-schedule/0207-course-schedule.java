class Solution {

    private boolean topologicalSortCheck(ArrayList<ArrayList<Integer>> adj , int n , int[] indegree){
        Queue<Integer> queue = new ArrayDeque<>();
        int count =0;
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
                count++;
            }
        }
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v:adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    queue.add(v);
                    count++;
                }
            }
        }
        boolean allTaken = (count == n);
        return allTaken;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //step 1 : convert the matrix into a graph 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] pair : prerequisites){
            int a = pair[0];
            int b = pair[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        boolean result = topologicalSortCheck(adj,numCourses,indegree);

        return result;
        
    }
}