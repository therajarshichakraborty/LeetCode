class Solution {

    public void dfsFirst(char[][] grid, int row , int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        dfsFirst(grid, row-1, col);
        dfsFirst(grid, row+1, col);
        dfsFirst(grid, row, col-1);
        dfsFirst(grid, row, col+1);
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] =='1'){
                    count++;
                    dfsFirst(grid, i, j);
                }
            }
        }

        return count;
    }
}