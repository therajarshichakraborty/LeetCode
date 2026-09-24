class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1 || s.length() <= 1) {
      return s;
    } else {
      StringBuilder result[] = new StringBuilder[numRows];
      Arrays.setAll(result, k -> new StringBuilder());
      int i = 0, k = -1;
      for (char c : s.toCharArray()) {
        result[i].append(c);
        if (i == 0 || i == numRows - 1) {
          k = -k;
        }
        i += k;
      }
      return String.join("", result);
    }
  }
}