class Solution {
  public int myAtoi(String s) {
    s = s.trim();
    if (s.isEmpty()) {
      return 0;
    }

    final int INT_MAX = Integer.MAX_VALUE;
    final int INT_MIN = Integer.MIN_VALUE;

    long result = 0; 
    boolean flag = false;
    int startIndex = 0;
    
    if (s.charAt(0) == '-') {
      flag = true;
      startIndex = 1;
    }
    else if (s.charAt(0) == '+') {
      startIndex = 1;
    }
    
    for (int i = startIndex; i < s.length(); i++) {
      char current = s.charAt(i);
      if (!Character.isDigit(current)) {
        break;
      } else {
        result = result * 10 + Character.getNumericValue(current);
        if (result > INT_MAX) { 
            break;
        }
      }
    }
    
    if (flag == true) {
      if (-1 * result <= INT_MIN) {
        return INT_MIN;
      }
    } else {
      if (result >= INT_MAX) {
        return INT_MAX;
      }
    }
    
    return (int) (flag ? -1 * result : result);
  }
}
