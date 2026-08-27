class Solution {
    static int sumOfDigits(int n) {
        int total = 0;
        while(n > 0){
            int rem = n%10;
            total+=rem;
            n/=10;
        }
        return total;
    }
}
