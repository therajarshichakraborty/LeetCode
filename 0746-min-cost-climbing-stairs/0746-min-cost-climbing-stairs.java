class Solution {
    static int dp [];
    
    public int minCost(int[] cost, int n){
      if (n < 0){
        return 0;
      }
      if(n ==0 || n==1){
        return cost[n];
      } 

      if(dp[n]!= -1){
        return dp[n];
      }

      dp[n] = cost[n]+ Math.min(minCost(cost, n-1),minCost(cost, n-2));
      return dp[n];
    }
    /* Solving using DP tabulation */
    public int minCostClimbingStairs(int[] cost) {
      int n = cost.length;
      dp = new int [n];
      dp[0] = cost[0];
      dp[1] = cost[1];
      for(int i=2;i<n;i++){
        dp[i] = cost[i]+Math.min(dp[i-1], dp[i-2]);
      }
      return Math.min(dp[n-1], dp[n-2]);
    }
}