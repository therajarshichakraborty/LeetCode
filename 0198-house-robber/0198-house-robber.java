class Solution {

  /** House Robber using Memoization */
  static int[] dp;

  public static int helper(int nums[], int n, int[] dp) {
    if (n >= nums.length) {
      return 0;
    }

    if (dp[n] != -1) {
      return dp[n];
    }
    int take = nums[n] + helper(nums, n + 2, dp);
    int skip = helper(nums, n + 1, dp);

    return dp[n] = Math.max(take, skip);
  }

  /** House Robber using Tabulation */

  public int rob(int[] nums) {
    int n = nums.length;
    if (n == 1) {
      return nums[0];
    }
    dp = new int[n];
    Arrays.fill(dp, -1);

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < n; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }

    return dp[n - 1];
  }
}