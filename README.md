# Arrays

Problems based on the Array data structure

## SDE Sheet problems on Arrays

[Sheet Link](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)

### Day 1

| Completion Status | Problems on Arrays | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [Sort an array of 0’s 1’s 2’s without using extra space or sorting algo](https://leetcode.com/problems/sort-colors/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/Sort012.java) |
| ✅ | [Repeat and Missing Number](https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/) | [Brute, Better & Optimal Approaches](#repeat-and-missing-number) | [Java Soultion](./src/sde_sheet/FindMissAndRepeatNum.java)
| ✅ | [Merge two sorted Arrays without extra space](https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/) | [Brute, Better & Optimal Approaches](#merge-two-sorted-arrays-without-extra-space) | [Java Soultion](./src/sde_sheet/MergeSortedArrays.java)
| ✅ | [Kadanes Algorithm](https://leetcode.com/problems/maximum-subarray/) | [Brute, Better & Optimal Approaches](#kadanes-algorithm) | [Java Soultion](./src/sde_sheet/MaximumSubarraySum.java)
| ✅ | [Merge Overlapping Subintervals](https://leetcode.com/problems/merge-intervals/) | [Brute, Better & Optimal Approaches](#merge-overlapping-subintervals) | [Java Soultion](./src/sde_sheet/MergeIntervals.java)
| ✅ | [Find the duplicate in an array of N+1 integers](https://leetcode.com/problems/find-the-duplicate-number/solution/) | [Brute, Better & Optimal Approaches](#find-the-duplicate-in-an-array) | [Java Soultion](./src/sde_sheet/DuplicateNumber.java)

### Day 2 (Arrays)

| Completion Status | Problems on Arrays | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/SetMatrixZeros.java)
| ✅ | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/PascalsTriangle.java)
| ✅ | [Next Permutation](https://leetcode.com/problems/next-permutation/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/NextPermutation.java)
| ✅ | [Count Inversions in an array](https://www.geeksforgeeks.org/counting-inversions/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/CountInversions.java)
| ✅ | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/BuyAndSellStock_I.java)
| ✅ | [Rotate Image](https://leetcode.com/problems/rotate-image/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/RotateMatrix.java)

### Day 3 (Array/Maths)

| Completion Status | Problems on Arrays | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/Search2Dmatrix.java)
| ✅ | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/PowerOfN.java)
| ✅ | [Majority Element](https://leetcode.com/problems/majority-element/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/MajorityElement_I.java)
| ✅ | [Majority Element II](https://leetcode.com/problems/majority-element-ii/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/MajorityElement_II.java)
| ✅ | [Unique Paths](https://leetcode.com/problems/unique-paths/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/GridUniquePaths.java)
| ✅ | [Reverse Pairs](https://leetcode.com/problems/reverse-pairs/) | [Brute, Better & Optimal Approaches](#sort-an-array) | [Java Soultion](./src/sde_sheet/ReversePairs.java)

---

### Sort an array

#### Sort an array of 0's 1's & 2's (without using extra space or sorting algo).
- Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
- We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
- You must solve this problem without using the library's sort function.

Example 1:
```
Input:    nums = [2,0,2,1,1,0]
Output:          [0,0,1,1,2,2]
```
Example 2:
```
Input:    nums = [2,0,1]
Output:          [0,1,2]
```

#### Approach:
**Brute-force | Time Complexity: O(N log N) | Space Complexity: O(1)**

- Sort the array

**Better          | Time Complexity: O(2N)         | Space Complexity: O(1)**

- Use Counting sort:
- Loop one for linear Traversal for counting number of 0's 1's & 2's
- Loop two for inserting 0's 1's & 2's using the obtained count

**Optimal       | Time Complexity: O(N)          | Space Complexity: O(1)**

- Use Dutch National Flag Algorithm
- Consider three pointers: low, mid and high
- Point low & mid at the starting point of the array
- And high at the end of the array
- Move mid pointer until mid crosses high and check:
  - mid == 0 then swap the values: 
    - a[low] <=> a[mid] 
    - And low++, mid++ (Increment both low and mid pointers)
  - mid == 1 then 
    - mid++ (increment mid pointer)
  - mid == 2 then swap the values: 
    - a[high] <=> a[mid] 
    - and high-- (decrement high pointer)
- The algorithm is based on the fact that:
  - Array elements from [0 - low-1] contains 0
  - Array elements from [high+1 - n] contains 2

[🔼 Back to Top 🔼](#Arrays)

---

### Repeat and Missing Number

- Given an unsorted array of size n. 
- Array elements are in the range from 1 to n. 
- One number from set {1, 2, …n} is missing and one number occurs twice in the array. 
- Find these two numbers.

Examples:
```
Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
```

```
Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1
```

#### Approach:
**Brute-force | Time Complexity: O(N log N) | Space Complexity: O(1)**
- Sort the input array.
- Traverse the array and check for missing and repeating.

**Better         | Time Complexity: O(N)           | Space Complexity: O(N)**
- Hashing: Create a temp array temp[] of size n with all initial values as 0.
- Traverse the input array arr[], and do following for each arr[i]
- if(temp[arr[i]] == 0) temp[arr[i]] = 1;
- if(temp[arr[i]] == 1) output “arr[i]” //repeating
- Traverse temp[] and output the array element having value as 0 (This is the missing element)

**Optimal - I | Time Complexity: O(N)        | Space Complexity: O(1)**
- Let x be the missing and y be the repeating element.
- Get the sum of all numbers using formula S = n(n+1)/2 – x + y
- Get product of all numbers using formula P = `1*2*3*…*n * y / x`
- The above two steps give us two equations, we can solve the equations and get the values of x and y.
- Note: This method can cause arithmetic overflow as we calculate product and sum of all array elements.

**Optimal - II | Time Complexity: O(N)       | Space Complexity: O(1)**
- Use XOR: Let x and y be the desired output elements.
- Calculate XOR of all the array elements:      xor1 = arr[0]^arr[1]^arr[2] ... arr[n-1]
- XOR the result with all numbers from 1 to n: xor1 = xor1^1^2^...^n
- In the result xor1, all elements would nullify each other except x and y.
- All the bits that are set in xor1 will be set in either x or y.
- So if we take any set bit (We have chosen the rightmost set bit in code) of xor1 and divide the elements of the array in two sets – one set of elements with the same bit set and other set with the same bit not set. By doing so, we will get x in one set and y in another set.
- Now if we do XOR of all the elements in the first set, we will get x, and by doing the same in the other set we will get y.

[🔼 Back to Top 🔼](#Arrays)

---

### Merge two sorted Arrays without extra space

Given two sorted arrays, we need to merge them in O((n+m)*log(n+m)) time with O(1) extra space into a sorted array, when n is the size of the first array, and m is the size of the second array.

Example:  
Input: ar1[] = {10};
       ar2[] = {2, 3};
Output: ar1[] = {2}
        ar2[] = {3, 10}  

Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}

Approach:
Brute-force | Time Complexity: O(N log N) | Space Complexity: O(N+M)
Create a new array: ‘merged’ of size (n+m)
Sort the ‘merged’ array.
Traverse the input arrays and place the elements from the ‘merged’ array.

Better         | Time Complexity: O(N*M)      | Space Complexity: O(1)
Linearly traverse input array 1 and compare it with input array 2 elements.
If elements from array 1 are greater than array 2, then swap them.
Apply insertion sort on array 2 each time the swap operation is applied.

Optimal      | Time Complexity: O()      | Space Complexity: O(1)
Gap method:
Take two pointers: left & right, separated with a gap of ceil of (N+M) /2
Traverse through the arrays linearly and compare the pointers
Swap the elements if a[left] > a[right]
Once pointers exceed the bounds, decrease the gap /2 till it reaches 1.

[🔼 Back to Top 🔼](#Arrays)

---

### Kadanes Algorithm

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23

Approach:
Brute-force   | Time Complexity: O(N3)           | Space Complexity: O(1)

- Iterate over all the subarrays using three loops: (i: 0 to n) (j: i to n) (k: i to j)
- Find the Maximum subarray sum among those.
- And return the maximum sum.

Better            | Time Complexity: O(N2)           | Space Complexity: O(1)  

- Optimize the approach by eliminating the third loop.
- Find the cumulative sum of subarrays using two loops.
- And return the maximum.

Optimal       | Time Complexity: O(N)              | Space Complexity: O(1)

- Kadane’s Algorithm:
- Find the cumulative sum of elements and update it in ‘sum’.
- If a negative ‘sum’ is encountered, update it to zero.
- Update the ‘max’ sum by comparing ‘max’ and ‘sum’.

[🔼 Back to Top 🔼](#Arrays)

---

### Merge Overlapping Subintervals

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

Ask the Interviewer: Whether all the intervals are given in sorted order or not?

Approach:
Brute-force   | Time Complexity: O(N logN + N2)           | Space Complexity: O(N)

- Sort all the intervals if they are given in an unsorted way.
- Choose an interval and iterate all other intervals to check for overlapping.
- Store the merged intervals in a new data structure(Array or vector).
- Check the next interval is present already and proceed.

Optimal        | Time Complexity: O(N logN + N)           | Space Complexity: O(N)

- Sort all the intervals if they are given in an unsorted way.
- Take the first interval as ‘pair’.
- Linearly traverse all the intervals using a pointer and check:
- If current interval overlaps with the ‘pair’ then merge it
- Else add the ‘pair’ in the data structure and update the ‘pair’ with current interval
- This algorithm accumulates overlapping intervals due to sorting.

[🔼 Back to Top 🔼](#Arrays)

---

### Find the duplicate in an array

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and use only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [1,1]
Output: 1

Example 4:
Input: nums = [1,1,2]
Output: 1

Approach:
Brute-force | Time Complexity: O(N log N) | Space Complexity: O(1)

- Sort the array.
- Then compare each element to the previous element.
- When a duplicate element is encountered, return the element.

Better          | Time Complexity: O(N)         | Space Complexity: O(N)

- Create a frequency array of size N
- Initialize the array with 0
- Update corresponding index by 1 through traversing.
- And return when repetition is found out.

Optimal       | Time Complexity: O(N) | Space Complexity: O(1)

- Floyd's Tortoise and Hare (Cycle Detection) algorithm
Floyd's Tortoise and Hare (Cycle Detection)
Intuition
The idea is to reduce the problem to Linked List Cycle II:
Given a linked list, return the node where the cycle begins.

First of all, where does the cycle come from? Let's use the function f(x) = nums[x] to construct the sequence: x, nums[x], nums[nums[x]], nums[nums[nums[x]]], ....
Each new element in the sequence is an element in nums at the index of the previous element.

If one starts from x = nums[0], such a sequence will produce a linked list with a cycle.
The cycle appears because nums contains duplicates. The duplicate node is a cycle entrance.

Here is how it works:
The example above is simple because the loop is small.
Here is a more interesting example:Now the problem is to find the entrance of the cycle.
Algorithm
Floyd's algorithm consists of two phases and uses two pointers, usually called tortoise and hare.
In phase 1, hare = nums[nums[hare]] is twice as fast as tortoise = nums[tortoise]. Since the hare goes fast, it would be the first one who enters the cycle and starts to run around the cycle.

At some point, the tortoise enters the cycle as well, and since it's moving slower the hare catches the tortoise up at some intersection point. Now phase 1 is over, and the tortoise has lost.

Note that the intersection point is not the cycle entrance in the general case.
To compute the intersection point, let's note that the hare has traversed twice as many nodes as the tortoise, i.e. 2d(tortoise)=d(hare), that means
2(F + a) = F + nC + a2(F+a)=F+nC+a, where nn is some integer.
Hence the coordinate of the intersection point is F + a = nCF+a=nC.

In phase 2, we give the tortoise a second chance by slowing down the hare, so that it now moves with the speed of tortoise: tortoise = nums[tortoise], hare = nums[hare]. The tortoise is back at the starting position, and the hare starts from the intersection point.
Let's show that this time they meet at the cycle entrance after FF steps:
The tortoise started from zero, so its position after FF steps is FF.
The hare started at the intersection point F + a = nCF+a=nC, so its position after F steps is nC + FnC+F, that is the same point as FF.
So the tortoise and the (slowed down) hare will meet at the entrance of the cycle.
Note
The first two approaches mentioned do not satisfy the constraints given in the prompt, but they are solutions that you might be likely to come up with during a technical interview. As an interviewer, I personally would not expect someone to come up with the cycle detection solution unless they have heard it before.
Proof
Proving that at least one duplicate must exist in nums is simple application of the pigeonhole principle. Here, each number in nums is a "pigeon" and each distinct number that can appear in nums is a "pigeonhole". Because there are n+1n+1 numbers are nn distinct possible numbers, the pigeonhole principle implies that at least one of the numbers is duplicated.

[🔼 Back to Top 🔼](#Arrays)

---
