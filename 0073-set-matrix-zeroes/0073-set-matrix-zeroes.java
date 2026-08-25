class Solution {
  public void setZeroes(int[][] matrix) {
      // int n = matrix.length;
      // int m = matrix[0].length;
      //   for(int i=0;i<n;i++){
      //     for(int j=0;j<m;j++){
      //       if(matrix[i][j] == 0){


      //         for(int row = 0;row<m;row++){
      //           if(matrix[i][row]!= 0){
      //             matrix[i][row] = -1;
      //           }
      //         }

      //         for(int col = 0;col<n;col++){
      //           if(matrix[col][j] != 0){
      //             matrix[col][j] = -1;
      //           }
      //         }
      //       }
      //     }
      //   }

      //   for(int i=0;i<n;i++){
      //     for(int j=0;j<m;j++){
      //       if(matrix[i][j] == -1){
      //         matrix[i][j] = 0;
      //       }
      //     }}

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    

    }
}