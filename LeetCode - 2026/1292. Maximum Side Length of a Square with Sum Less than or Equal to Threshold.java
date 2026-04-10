1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a m x n matrix mat and an integer threshold, return the maximum side-length of a square with a sum less than or equal to threshold or return 0 if there is no such square.

 

Example 1:


Input: mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
Output: 2
Explanation: The maximum side length of square with sum less than 4 is 2 as shown.
Example 2:

Input: mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
Output: 0
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 300
0 <= mat[i][j] <= 104
0 <= threshold <= 105class Solution {

    private boolean isValid(int[][] pref, int k, int limit) {
        int n = pref.length;
        int m = pref[0].length;

        for (int i = k - 1; i < n; i++) {
            for (int j = k - 1; j < m; j++) {
                int x1 = i - k + 1;
                int y1 = j - k + 1;

                int sum = pref[i][j];
                if (x1 > 0) sum -= pref[x1 - 1][j];
                if (y1 > 0) sum -= pref[i][y1 - 1];
                if (x1 > 0 && y1 > 0) sum += pref[x1 - 1][y1 - 1];

                if (sum <= limit)
                    return true;
            }
        }
        return false;
    }

    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] pref = new int[n][m];

        for (int i = 0; i < n; i++)
            System.arraycopy(mat[i], 0, pref[i], 0, m);

        for (int i = 0; i < n; i++)
            for (int j = 1; j < m; j++)
                pref[i][j] += pref[i][j - 1];

        for (int j = 0; j < m; j++)
            for (int i = 1; i < n; i++)
                pref[i][j] += pref[i - 1][j];

        int low = 1, high = Math.min(n, m);
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isValid(pref, mid, threshold)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
