class Solution {

  /** Fibonacci using Tabulation */

  static int dp[];

  /**
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
  */

  public int fib(int n) {
    if (n <= 1) {
      return n;
    }
    dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
}