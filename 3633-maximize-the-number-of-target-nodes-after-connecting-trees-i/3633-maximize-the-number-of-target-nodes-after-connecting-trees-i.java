class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        int[] count1 = build(edges1,k);
        // k - 1 because we skip the bridge between tree1 and tree2
        int[] count2 = build(edges2,k - 1);
        int maxCount2 = 0;
        // find maximum count of tree2 since we can pcik whatever we want
        for(int max:count2){
            if(max > maxCount2){
                maxCount2 = max;
            }
        }
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = count1[i] + maxCount2;
        }
        return res;
    }

    // build adjacent graph
    private int[] build(int[][] edges, int k){
        int n = edges.length + 1;
        List<List<Integer>> children = new ArrayList<>();
        for(int i = 0; i < n; i++){
            children.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            // create edges for undirected graph
            children.get(edge[0]).add(edge[1]);
            children.get(edge[1]).add(edge[0]);
        }

        int[] res = new int[n];
        for(int i =0; i<n; i++){
            res[i] = dfs(i, -1, children, k);
        }
        return res;
    }

    // dfs
    private int dfs(int node, int parent, List<List<Integer>> children, int k){
        // limit
       if(k <0){
        return 0;
       }     
        int res = 1;
        for(int child:children.get(node)){
            if(child == parent){
                continue;
            }
            res += dfs(child,node, children, k - 1);
        }
        return res;

    }
}