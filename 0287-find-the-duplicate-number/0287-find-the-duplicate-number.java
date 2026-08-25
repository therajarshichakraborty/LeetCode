class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int duplicate=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            } else {
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }
}