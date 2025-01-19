
class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        
        // managing the edge cases
        if(k == 0 || head== null || head.next == null){
            return head;
        }

        int len = 1;
        Node curr = head;
        
        
        // finding the length of the list

        while(curr.next != null){
            curr = curr.next;
            len++;
        }

        // finding the value so that for larger k values
        // we can optimize the number of loops
        k %= len;

        // if k is divisble or len is divisible by k
        // the list remains the same
        if(k == 0){
            return head;
        }

        // turning the list as a circular linked list
        curr.next = head;


        // finding the kth point so we can cut off where the point ends
        for(int i = 0; i < k; i++){
            curr = curr.next;
        }

        // making the kth point of rotation as head 
        head = curr.next;
        
        // making the list normal -> non circular by this
        curr.next = null;


        return head;
    }
}
