class Solution {
  public int reverse(int x) {
    int reverse = 0;
    boolean isNegetive = (x < 0);

    String str = String.valueOf(Math.abs(x));
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();

    try {
      reverse = Integer.parseInt(sb.toString());
    } catch (NumberFormatException e) {
      return 0;
    }

      return isNegetive ? -reverse : reverse;
  }
}