
// User function Template for Java

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node ntng = new Node(-1);
        if(head == null){
            return ntng;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            
            if(fast.next != null){
                fast = fast.next;
            }
            
            if(slow == fast){
                break;
            }
        }
        
        if(slow != fast){
            return ntng;
        }
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}
