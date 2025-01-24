

// User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
}
