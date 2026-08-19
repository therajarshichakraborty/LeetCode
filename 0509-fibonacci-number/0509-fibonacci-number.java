class Solution {

  /** Fibonacci using Memoization */

  static int dp[];

  public int helper(int n) {
    if (n <= 1) {
      return n;
    }
    if (dp[n] != 0) {
      return dp[n];
    }

    int answer = helper(n - 1) + helper(n - 2);
    dp[n] = answer;
    return answer;
  }

  public int fib(int n) {
    dp = new int[n + 1];
    return helper(n);
  }
}