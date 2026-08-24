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

  public int rob(int[] nums) {
    dp = new int[nums.length];
    Arrays.fill(dp, -1);
    return helper(nums, 0, dp);
  }
}