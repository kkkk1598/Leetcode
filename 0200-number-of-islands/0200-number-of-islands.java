class Solution {
    public int numIslands(char[][] grid) {
        //base case
        if(grid == null || grid.length == 0){
            return 0;
        }     

        int islands = 0;
        for(int i =0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }  

        return islands;
    }

    // private method for recursion
    private void dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '0'; //mark as visited
        dfs(grid, i + 1, j); // search down
        dfs(grid, i - 1, j); // search up
        dfs(grid, i, j + 1); // search right
        dfs(grid, i, j - 1); // search left

    }
}