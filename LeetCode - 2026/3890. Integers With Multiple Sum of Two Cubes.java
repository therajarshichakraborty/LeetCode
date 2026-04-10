3890. Integers With Multiple Sum of Two Cubes
Solved
Medium
premium lock icon
Companies
Hint
You are given an integer n.

An integer x is considered good if there exist at least two distinct pairs (a, b) such that:

a and b are positive integers.
a <= b
x = a3 + b3
Return an array containing all good integers less than or equal to n, sorted in ascending order.

 

Example 1:

Input: n = 4104

Output: [1729,4104]

Explanation:

Among integers less than or equal to 4104, the good integers are:

1729: 13 + 123 = 1729 and 93 + 103 = 1729.
4104: 23 + 163 = 4104 and 93 + 153 = 4104.
Thus, the answer is [1729, 4104].

Example 2:

Input: n = 578

Output: []

Explanation:

There are no good integers less than or equal to 578, so the answer is an empty array.

 

Constraints:

1 <= n <= 109


class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> count = new HashMap<>();
        int limit = (int) Math.cbrt(n);

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int sum = (a * a * a) + (b * b * b);
                if (sum > n) {
                    break;
                }
                count.put(sum, count.getOrDefault(sum, 0) + 1);

            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
}
