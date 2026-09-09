class Solution {
    public int[] twoSum(int[] nums, int target) {
      /*
        1. traverse the array
        2. int newTarget = target - arr[i]
        3. if( map.containsKey(newTarget) ){
            return new int []  { i, map.get(target - num) 
        }
        return new int []{};
      */
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
          
          int complement = target - nums[i];
          if(map.containsKey(complement)){
            return new int [] {map.get(complement),i};
          }

          map.put(nums[i],i);
        }

        return new int[] {};

    }
}