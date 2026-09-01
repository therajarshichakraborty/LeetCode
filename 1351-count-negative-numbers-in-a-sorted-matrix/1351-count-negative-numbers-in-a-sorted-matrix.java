class Solution {
    public int countNegatives(int[][] mat) {
      if (mat == null || mat.length == 0 || mat[0].length == 0) { 
            return 0; 
        } 

        /**
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] <0){
                  count++;
                }
            }
        }
        
        return count;
        */

        int m = mat.length, n = mat[0].length;
        int i = m - 1, j = 0;

        int res = 0;

        while (i >= 0 && j < n) {
            if (mat[i][j] < 0) {
                res += n - j;
                i--;
            } else
                j++;
        }

        return res;
    }
}