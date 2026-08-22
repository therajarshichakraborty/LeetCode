class Solution {

  public int totalDigit(int n){
    int count = 0;
    while(n>0){
      n/=10;
      count++;
    }

    return count;
  }
  public int findNumbers(int[] nums) {
    int count = 0;
      for(int num:nums){
        int result = totalDigit(num);
        if(result % 2 == 0){
          count++;
        }
      }

      return count;
  }
}