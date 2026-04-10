3507. Minimum Pair Removal to Sort Array I
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums, you can perform the following operation any number of times:

Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
Replace the pair with their sum.
Return the minimum number of operations needed to make the array non-decreasing.

An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).

 

Example 1:

Input: nums = [5,2,3,1]

Output: 2

Explanation:

The pair (3,1) has the minimum sum of 4. After replacement, nums = [5,2,4].
The pair (2,4) has the minimum sum of 6. After replacement, nums = [5,6].
The array nums became non-decreasing in two operations.

Example 2:

Input: nums = [1,2,2]

Output: 0

Explanation:

The array nums is already sorted.

 

Constraints:

1 <= nums.length <= 50
-1000 <= nums[i] <= 1000class Solution {

    public int minimumPairRemoval(int[] nums) {
        var n = nums.length;
        var next = new int[n];
        Arrays.setAll(next, i -> i + 1);
        next[n - 1] = -1;
        var count = 0;

        while (n - count > 1) {
            var curr = 0;
            var target = 0;
            var targetAdjSum = nums[target] + nums[next[target]];
            var isAscending = true;

            while (curr != -1 && next[curr] != -1) {
                if (nums[curr] > nums[next[curr]]) {
                    isAscending = false;
                }

                var currAdjSum = nums[curr] + nums[next[curr]];
                if (currAdjSum < targetAdjSum) {
                    target = curr;
                    targetAdjSum = currAdjSum;
                }
                curr = next[curr];
            }

            if (isAscending) {
                break;
            }

            count++;
            next[target] = next[next[target]];
            nums[target] = targetAdjSum;
        }

        return count;
    }
}
