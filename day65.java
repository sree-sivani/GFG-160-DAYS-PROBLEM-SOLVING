class Solution {
    // Function to reverse a linked list
    Node reverseList(Node head) {
        // Initialize pointers: 
        // 'curr' to traverse the list, 'prev' to track the previous node, 
        // and 'next' to temporarily store the next node
        Node curr = head;
        Node next;
        Node prev = null;

        // Iterate through the linked list
        while(curr != null){
            // Store the next node before breaking the link
            next = curr.next;
            
            // Reverse the link of the current node
            curr.next = prev;
            
            // Move 'prev' and 'curr' one step forward
            prev = curr;
            curr = next;
        }
        
        // 'prev' is now the new head of the reversed list
        return prev;
    }
}
