class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    // for(int i=0;i<matrix.length;i++){
    //   for(int j = 0;j<matrix[0].length;j++){
    //     if(matrix[i][j] == target){
    //       return true;
    //     }
    //   }
    // }

    // return false;

    int rows = matrix.length;
    int cols = matrix[0].length;
    int low = 0;
    int high = rows * cols - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      int row = mid / cols;
      int col = mid % cols;
      int guess = matrix[row][col];

      if (guess == target) {
        return true;
      } else if (guess < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return false;
  }
}