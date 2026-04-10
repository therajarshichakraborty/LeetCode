3070. Count Submatrices with Top-Left Element and Sum Less Than k
Medium
Topics
premium lock icon
Companies
You are given a 0-indexed integer matrix grid and an integer k.

Return the number of submatrices that contain the top-left element of the grid, and have a sum less than or equal to k.

 

Example 1:


Input: grid = [[7,6,3],[6,6,1]], k = 18
Output: 4
Explanation: There are only 4 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 18.
Example 2:


Input: grid = [[7,2,9],[1,5,0],[2,6,6]], k = 20
Output: 6
Explanation: There are only 6 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 20.
 

Constraints:

m == grid.length 
n == grid[i].length
1 <= n, m <= 1000 
0 <= grid[i][j] <= 1000
1 <= k <= 109
 
Seen this question in a real interview before?
1/5
Yes
No
Accepted
89,061/123.1K
Acceptance Rate
72.3%
Topics
icon
Companies
Discussion (66)

Choose a type



Copyright © 2026 LeetCode. All rights reserved.

372


66


4645 Online
Java
Auto





11234
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        
    }
}
Saved
Daily Question

Tag
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

3640. Trionic Array II
Hard

3379. Transformed Array
Easy

3634. Minimum Removals to Balance Array
Med.

1653. Minimum Deletions to Make String Balanced
Med.

110. Balanced Binary Tree
Easy

1382. Balance a Binary Search Tree
Med.

3719. Longest Balanced Subarray I
Med.

3721. Longest Balanced Subarray II
Hard

3713. Longest Balanced Substring I
Med.

3714. Longest Balanced Substring II
Med.

799. Champagne Tower
Med.

67. Add Binary
Easy

190. Reverse Bits
Easy

401. Binary Watch
Easy

693. Binary Number with Alternating Bits
Easy

696. Count Binary Substrings
Easy

761. Special Binary String
Hard

762. Prime Number of Set Bits in Binary Representation
Easy

868. Binary Gap
Easy

1461. Check If a String Contains All Binary Codes of Size K
Med.

1022. Sum of Root To Leaf Binary Numbers
Easy

1356. Sort Integers by The Number of 1 Bits
Easy

1404. Number of Steps to Reduce a Number in Binary Representation to One
Med.

3666. Minimum Operations to Equalize Binary String
Hard

1680. Concatenation of Consecutive Binary Numbers
Med.

1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
Med.

1536. Minimum Swaps to Arrange a Binary Grid
Med.

1545. Find Kth Bit in Nth Binary String
Med.

1582. Special Positions in a Binary Matrix
Easy

1758. Minimum Changes To Make Alternating Binary String
Easy

1784. Check if Binary String Has at Most One Segment of Ones
Easy

1888. Minimum Number of Flips to Make the Binary String Alternating
Med.

1980. Find Unique Binary String
Med.

3129. Find All Possible Stable Binary Arrays I
Med.

3130. Find All Possible Stable Binary Arrays II
Hard

1009. Complement of Base 10 Integer
Easy

3600. Maximize Spanning Tree Stability with Upgrades
Hard

3296. Minimum Number of Seconds to Make Mountain Height Zero
Med.

1415. The k-th Lexicographical String of All Happy Strings of Length n
Med.

1622. Fancy Sequence
Hard

1878. Get Biggest Three Rhombus Sums in a Grid
Med.

1727. Largest Submatrix With Rearrangements
Med.

3070. Count Submatrices with Top-Left Element and Sum Less Than k
Med.

class Solution {

    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[] cols = new int[m];
        int res = 0;

        for (int i = 0; i < n; i++) {
            int rows = 0;
            for (int j = 0; j < m; j++) {
                cols[j] += grid[i][j];
                rows += cols[j];
                if (rows <= k) {
                    res++;
                }
            }
        }

        return res;
    }
}
