3637. Trionic Array I
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums of length n.

An array is trionic if there exist indices 0 < p < q < n − 1 such that:

nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.

 

Example 1:

Input: nums = [1,3,5,4,2,6]

Output: true

Explanation:

Pick p = 2, q = 4:

nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
nums[4...5] = [2, 6] is strictly increasing (2 < 6).
Example 2:

Input: nums = [2,1,3]

Output: false

Explanation:

There is no way to pick p and q to form the required three segments.

 

Constraints:

3 <= n <= 100
-1000 <= nums[i] <= 1000
 
Seen this question in a real interview before?
1/5
Yes
No
Accepted
138,612/284.3K
Acceptance Rate
48.7%
Topics
icon
Companies
Hint 1
Discussion (170)

Choose a type



Copyright © 2026 LeetCode. All rights reserved.

337


170


6544 Online
Java
Auto





65432119
                return false;
            }
            if ((nums[i - 2] - nums[i - 1]) * (nums[i - 1] - nums[i]) < 0) {
                count++;
            }
        }
        return count == 3;
    }
}
Saved
You must run your code first
Daily Question

Tag
1304. Find N Unique Integers Sum up to Zero
Easy

1317. Convert Integer to the Sum of Two No-Zero Integers
Easy

2327. Number of People Aware of a Secret
Med.

1733. Minimum Number of People to Teach
Med.

2785. Sort Vowels in a String
Med.

3227. Vowels Game in a String
Med.

3541. Find Most Frequent Vowel and Consonant
Easy

966. Vowel Spellchecker
Med.

1935. Maximum Number of Words You Can Type
Easy

2197. Replace Non-Coprime Numbers in Array
Hard

2353. Design a Food Rating System
Med.

3408. Design Task Manager
Med.

3484. Design Spreadsheet
Med.

3508. Implement Router
Med.

1912. Design Movie Rental System
Hard

3005. Count Elements With Maximum Frequency
Easy

165. Compare Version Numbers
Med.

166. Fraction to Recurring Decimal
Med.

120. Triangle
Med.

611. Valid Triangle Number
Med.

812. Largest Triangle Area
Easy

976. Largest Perimeter Triangle
Easy

1039. Minimum Score Triangulation of Polygon
Med.

2221. Find Triangular Sum of an Array
Med.

1518. Water Bottles
Easy

3100. Water Bottles II
Med.

407. Trapping Rain Water II
Hard

11. Container With Most Water
Med.

417. Pacific Atlantic Water Flow
Med.

778. Swim in Rising Water
Hard

1488. Avoid Flood in The City
Med.

2300. Successful Pairs of Spells and Potions
Med.

3494. Find the Minimum Amount of Time to Brew Potions
Med.

3147. Taking Maximum Energy From the Mystic Dungeon
Med.

3186. Maximum Total Damage With Spell Casting
Med.

3539. Find Sum of Array Product of Magical Sequences
Hard

2273. Find Resultant Array After Removing Anagrams
Easy

3349. Adjacent Increasing Subarrays Detection I
Easy

3350. Adjacent Increasing Subarrays Detection II
Med.

2598. Smallest Missing Non-negative Integer After Operations
Med.

3003. Maximize the Number of Partitions After Operations
Hard

3397. Maximum Number of Distinct Elements After Operations
Med.

1625. Lexicographically Smallest String After Applying Operations
Med.

2011. Final Value of Variable After Performing Operations
Easy

3346. Maximum Frequency of an Element After Performing Operations I
Med.

3347. Maximum Frequency of an Element After Performing Operations II
Hard

3461. Check If Digits Are Equal in String After Operations I
Easy

2048. Next Greater Numerically Balanced Number
Med.

1716. Calculate Money in Leetcode Bank
Easy

2043. Simple Bank System
Med.

2125. Number of Laser Beams in a Bank
Med.

3354. Make Array Elements Equal to Zero
Easy

3370. Smallest Number With All Set Bits
Easy

1526. Minimum Number of Increments on Subarrays to Form a Target Array
Hard

3289. The Two Sneaky Numbers of Digitville
Easy

3217. Delete Nodes From Linked List Present in Array
Med.

2257. Count Unguarded Cells in the Grid
Med.

1578. Minimum Time to Make Rope Colorful
Med.

3318. Find X-Sum of All K-Long Subarrays I
Easy

3321. Find X-Sum of All K-Long Subarrays II
Hard

3607. Power Grid Maintenance
Med.

2528. Maximize the Minimum Powered City
Hard

1611. Minimum One Bit Operations to Make Integers Zero
Hard

2169. Count Operations to Obtain Zero
Easy

3542. Minimum Operations to Convert All Elements to Zero
Med.

474. Ones and Zeroes
Med.

2654. Minimum Number of Operations to Make All Array Elements Equal to 1
Med.

3228. Maximum Number of Operations to Move Ones to the End
Med.

2536. Increment Submatrices by One
Med.

3234. Count the Number of Substrings With Dominant Ones
Med.

1513. Number of Substrings With Only 1s
Med.

1437. Check If All 1's Are at Least Length K Places Away
Easy

717. 1-bit and 2-bit Characters
Easy

2154. Keep Multiplying Found Values by Two
Easy

757. Set Intersection Size At Least Two
Hard

1930. Unique Length-3 Palindromic Subsequences
Med.

3190. Find Minimum Operations to Make All Elements Divisible by Three
Easy

1262. Greatest Sum Divisible by Three
Med.

1018. Binary Prefix Divisible By 5
Easy

1015. Smallest Integer Divisible by K
Med.

2435. Paths in Matrix Whose Sum Is Divisible by K
Hard

3381. Maximum Subarray Sum With Length Divisible by K
Med.

2872. Maximum Number of K-Divisible Components
Hard

3512. Minimum Operations to Make Array Sum Divisible by K
Easy

1590. Make Sum Divisible by P
Med.

2141. Maximum Running Time of N Computers
Hard

3623. Count Number of Trapezoids I
Med.

3625. Count Number of Trapezoids II
Hard

2211. Count Collisions on a Road
Med.

3432. Count Partitions with Even Sum Difference
Easy

3578. Count Partitions With Max-Min Difference at Most K
Med.

1523. Count Odd Numbers in an Interval Range
Easy

1925. Count Square Sum Triples
Easy

3583. Count Special Triplets
Med.

3577. Count the Number of Computer Unlocking Permutations
Med.

3531. Count Covered Buildings
Med.

3433. Count Mentions Per User
Med.

3606. Coupon Code Validator
Easy

2147. Number of Ways to Divide a Long Corridor
Hard

2110. Number of Smooth Descent Periods of a Stock
Med.

3562. Maximum Profit from Trading Stocks with Discounts
Hard

3573. Best Time to Buy and Sell Stock V
Med.

3652. Best Time to Buy and Sell Stock using Strategy
Med.

2092. Find All People With Secret
Hard

944. Delete Columns to Make Sorted
Easy

955. Delete Columns to Make Sorted II
Med.

960. Delete Columns to Make Sorted III
Hard

2054. Two Best Non-Overlapping Events
Med.

3074. Apple Redistribution into Boxes
Easy

3075. Maximize Happiness of Selected Children
Med.

2483. Minimum Penalty for a Shop
Med.

2402. Meeting Rooms III
Hard

1351. Count Negative Numbers in a Sorted Matrix
Easy

756. Pyramid Transition Matrix
Med.

840. Magic Squares In Grid
Med.

1970. Last Day Where You Can Still Cross
Hard

66. Plus One
Easy

961. N-Repeated Element in Size 2N Array
Easy

1411. Number of Ways to Paint N × 3 Grid
Hard

1390. Four Divisors
Med.

1975. Maximum Matrix Sum
Med.

1161. Maximum Level Sum of a Binary Tree
Med.

1339. Maximum Product of Splitted Binary Tree
Med.

1458. Max Dot Product of Two Subsequences
Hard

865. Smallest Subtree with all the Deepest Nodes
Med.

712. Minimum ASCII Delete Sum for Two Strings
Med.

85. Maximal Rectangle
Hard

1266. Minimum Time Visiting All Points
Easy

3453. Separate Squares I
Med.

3454. Separate Squares II
Hard

2943. Maximize Area of Square Hole in Grid
Med.

2975. Maximum Square Area by Removing Fences From a Field
Med.

3047. Find the Largest Area of Square Inside Two Rectangles
Med.

1895. Largest Magic Square
Med.

1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold
Med.

3314. Construct the Minimum Bitwise Array I
Easy

3315. Construct the Minimum Bitwise Array II
Med.

3507. Minimum Pair Removal to Sort Array I
Easy

3510. Minimum Pair Removal to Sort Array II
Hard

1877. Minimize Maximum Pair Sum in Array
Med.

1984. Minimum Difference Between Highest and Lowest of K Scores
Easy

1200. Minimum Absolute Difference
Easy

3650. Minimum Cost Path with Edge Reversals
Med.

3651. Minimum Cost Path with Teleportations
Hard

2976. Minimum Cost to Convert String I
Med.

2977. Minimum Cost to Convert String II
Hard

744. Find Smallest Letter Greater Than Target
Easy

3010. Divide an Array Into Subarrays With Minimum Cost I
Easy

3013. Divide an Array Into Subarrays With Minimum Cost II
Hard

3637. Trionic Array I
Easy

class Solution {

    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (nums[0] >= nums[1]) {
            return false;
        }
        int count = 1;
        for (int i = 2; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                return false;
            }
            if ((nums[i - 2] - nums[i - 1]) * (nums[i - 1] - nums[i]) < 0) {
                count++;
            }
        }
        return count == 3;
    }
}
