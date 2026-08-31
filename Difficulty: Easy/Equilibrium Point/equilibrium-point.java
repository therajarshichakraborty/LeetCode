class Solution {
    public static int findEquilibrium(int arr[]) {
       
        int n = arr.length;
        long sum = 0;
        for (int i = 0; i < n; i++) sum += arr[i];
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum = sum - arr[i];
            if (sum2 == sum) {
                return i;
            }
            sum2 = sum2 + arr[i];
        }
        return -1;
    }
}
