class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    /** 
    int result []  = new int [nums.length-k+1];
    if(nums == null || nums.length == 0 || k ==-1){
      return result;
    } 
    
    for(int  i=0;i<=nums.length-k;i++){
      int max = nums[i];
      for(int j = i;j<i+k;j++){
      if (nums[j] > max) {
                max = nums[j];
            }
      }
    
      result[i] = max;
    }
    
    return result;
    */
    int n = nums.length;
    Deque<Integer> dq = new ArrayDeque<>();

    int x = 0;
    int result[] = new int[n - k + 1];
    if (nums == null || n == 0 || k <= 0) {
      return new int[0];
    }

    for (int i = 0; i < n; i++) {
      while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
        dq.pollLast();
      }

      dq.offerLast(i);

      if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
        dq.pollFirst();
      }

      if (!dq.isEmpty() && i >= k - 1) {
        result[x++] = nums[dq.peekFirst()];
      }
    }

    return result;

  }
}