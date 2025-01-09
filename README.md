# 150-DAYS-CODING-CHALLENGE

# 🚀 Day 1: Two Sum - Finding the Perfect Pair!

**Problem Statement:**  
You are given:  
- An array of integers `nums`.  
- A target integer `target`.  

💡 **Task:** Find two numbers in the array that add up to the target and return their indices.  

**Logic:**  

1. Use a hashmap to store each number and its index as you iterate through the array.  
2. For each number:  
   - Calculate the complement: `(target - current number)`.  
   - Check if the complement exists in the hashmap.  
3. If the complement is found:  
   - Return the indices of the current number and its complement.  
4. Otherwise, store the current number in the hashmap for future reference.  
5. Ensures an efficient solution with `O(n)` time complexity.  

---

# 🌟 Day 2: Add Two Numbers - Summing Up in Style!

**Problem Statement:**  
You are given two non-empty linked lists representing two non-negative integers.  

💡 **Task:** Add the two numbers and return the sum as a linked list.  

**Logic:**  

1. Traverse both linked lists digit by digit.  
   - Treat missing digits as `0` if one list is shorter.  
2. Add the corresponding digits along with a carry value (initially `0`).  
3. Create a new node with the value `(sum % 10)` (current digit).  
4. Update the carry to `(sum / 10)` for the next digit.  
5. Continue until all digits and the carry are fully processed.  
6. The resulting linked list represents the sum, stored in reverse order.  

