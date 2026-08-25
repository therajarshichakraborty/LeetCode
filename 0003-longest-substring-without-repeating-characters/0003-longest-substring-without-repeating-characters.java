class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        1. given string s
        2. max_length = 0

        for i=0 to n-1:
          seen = {}
          for j=i to n-1:
            if s[j] includes in seen: break
            else seen.add(s[j])
          
          max_length = max(max_length, j-i)
        
        return max_length
        */

        int maxLength = 0;

        for(int i=0;i<s.length();i++){
          Set<Character> seen = new HashSet<>();

          for(int j=i;j<s.length();j++){
            if(seen.contains(s.charAt(j))){
              break;
            }else {
              seen.add(s.charAt(j));
              maxLength =Math.max(maxLength, j-i+1);
            }
          }
        }

    return maxLength;
    }
}