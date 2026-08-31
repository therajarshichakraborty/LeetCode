class Solution {
  public List<Integer> majorityElement(int[] nums) {
        /*
          hashmap<integer>;
          list result;
            int majorityCount = nums.length / 3;
          for num:nums {
          int count =map.getOrDefault(num,0)+1
            map.put(num,count);
          }

          for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        
        return result;

         */


         Map<Integer,Integer> map = new HashMap<>();
         List<Integer> result = new ArrayList<>();

         int threshold = nums.length / 3;

         for(int num:nums){
          int count = map.getOrDefault(num,0)+1;
          map.put(num,count);
         }

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
         }

            return result;
    }
}