class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDiff = 0;
        
        for(int i=1;i<nums.length;i++){
          if(Math.abs(nums[i-1] - nums[i]) > maxDiff){
            maxDiff = Math.abs(nums[i-1] - nums[i]);
          }
        }

        return maxDiff;
    }
}