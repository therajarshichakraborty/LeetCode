3848. Check Digitorial Permutation
Solved
Medium
premium lock icon
Companies
Hint
You are given an integer n.

A number is called digitorial if the sum of the factorials of its digits is equal to the number itself.

Determine whether any permutation of n (including the original order) forms a digitorial number.

Return true if such a permutation exists, otherwise return false.

Note:

The factorial of a non-negative integer x, denoted as x!, is the product of all positive integers less than or equal to x, and 0! = 1.
A permutation is a rearrangement of all the digits of a number that does not start with zero. Any arrangement starting with zero is invalid.
 

Example 1:

Input: n = 145

Output: true

Explanation:

The number 145 itself is digitorial since 1! + 4! + 5! = 1 + 24 + 120 = 145. Thus, the answer is true.

Example 2:

Input: n = 10

Output: false

Explanation:​​​​​​​

10 is not digitorial since 1! + 0! = 2 is not equal to 10, and the permutation "01" is invalid because it starts with zero.

 

Constraints:

1 <= n <= 109class Solution {
    public boolean haveSameDigitsOrNot(int x , int y){
        String a = String.valueOf(x);
        String b = String.valueOf(y);

        if( a.length() != b.length()){
            return false;
        } else {
            char [] first = a.toCharArray();
            char [] second = b.toCharArray();

            Arrays.sort(first);
            Arrays.sort(second);

            return Arrays.equals(first,second);
        }
    }
    
    public boolean isDigitorialPermutation(int n) {
        int [] fact = new int [10];
        fact[0] = 1;

        for(int i=1;i<=9;i++){
            fact[i]= fact[i-1]*i;
        }

        int currentSum =0;
        int tempSum = n;

        while(tempSum != 0){
            int lastDigit = tempSum %10;
            currentSum += fact[lastDigit];
            tempSum /= 10;
        }

        return haveSameDigitsOrNot(n , currentSum);
    }
}
