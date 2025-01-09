class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Create a dummy node to act as the starting point for the result linked list
        ListNode ptr = dummy; // Pointer to traverse and build the result linked list
        int carry = 0; // Initialize carry to handle sums greater than or equal to 10

        while (l1 != null || l2 != null || carry != 0) { // Loop until both lists are exhausted and there is no carry left
            int digit1 = (l1 != null) ? l1.val : 0; // Extract the value from l1 if it exists, otherwise use 0
            int digit2 = (l2 != null) ? l2.val : 0; // Extract the value from l2 if it exists, otherwise use 0

            int sum = digit1 + digit2 + carry; // Calculate the sum of the two digits and the carry
            int digit = sum % 10; // The new digit to be added to the result is the remainder of the sum divided by 10
            carry = sum / 10; // Update carry to be the quotient of the sum divided by 10

            ListNode newNode = new ListNode(digit); // Create a new node with the calculated digit
            ptr.next = newNode; // Append the new node to the result list
            ptr = ptr.next; // Move the pointer to the newly added node

            l1 = (l1 != null) ? l1.next : null; // Move to the next node in l1 if it exists
            l2 = (l2 != null) ? l2.next : null; // Move to the next node in l2 if it exists
        }

        ListNode result = dummy.next; // Skip the dummy node and return the actual result list
        dummy.next = null; // Optional: disconnect the dummy node for clarity
        return result; // Return the result linked list
    }
}
