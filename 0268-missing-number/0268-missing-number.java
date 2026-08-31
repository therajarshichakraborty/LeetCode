class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totalSum = n * (n + 1) / 2;

        long currSum = 0;
        for(int num :nums){
          currSum += num;
        }

        return (int) (totalSum -currSum);
    }
}