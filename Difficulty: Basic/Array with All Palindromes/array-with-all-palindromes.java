class Solution {
    public boolean isPalinArray(int[] arr) {

        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }

        return true;
    }

    private boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}