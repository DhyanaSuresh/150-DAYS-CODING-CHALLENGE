# 150-DAYS-CODING-CHALLENGE

🚀 Day 1: Two Sum - Finding the Perfect Pair!
Problem Statement:
You are given an array of integers nums and a target integer target. Your task is to find two numbers in the array that add up to the target. Return their indices as the result. Assume there’s exactly one solution, and you cannot use the same element twice.

Logic:

1 . Use a hashmap to store each number and its index as you iterate through the array.
2 . For each number, calculate the complement (target - current number).
3 . If the complement exists in the hashmap, return the indices of the current number and its complement.
4 . Otherwise, store the current number in the hashmap for future reference.
5 . This ensures an efficient solution with O(n) time complexity.


🌟 Day 2: Add Two Numbers - Summing Up in Style!
Problem Statement:
You are given two non-empty linked lists that represent two non-negative integers. The digits are stored in reverse order, and each node contains a single digit. Add the two numbers together and return the sum as a linked list. Assume the numbers do not contain leading zeros.

Logic:

1 . Traverse both linked lists digit by digit. If one list is shorter, treat the missing digits as 0.
2 . Add the digits from both lists along with a carry value (initially 0).
3 . Store the result of (sum % 10) as a new node in the output list (this gives the current digit).
4 . Update the carry to (sum / 10) to handle overflow to the next digit.
5 . Continue until both lists and the carry are fully processed.
6 . The result linked list represents the sum, stored in reverse order.
