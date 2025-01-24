
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node res = null;
        Node curr = null;
        int carry = 0;
      
        num1 = trimLeadingZeros(num1);
        num2 = trimLeadingZeros(num2);
      
        num1 = reverse(num1);
        num2 = reverse(num2);

        // Iterate till either num1 is not empty or num2 is
        // not empty or carry is greater than 0
        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;

            // If num1 linked list is not empty, add it to sum
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            // If num2 linked list is not empty, add it to sum
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
          
            // Create a new node with sum % 10 as its value
            Node newNode = new Node(sum % 10);

            // Store the carry for the next nodes
            carry = sum / 10;

            // If this is the first node, then make this node
            // as the head of the resultant linked list
            if (res == null) {
                res = newNode;
                curr = newNode;
            } else {
                // Append new node to resultant linked list
                // and move to the next node
                curr.next = newNode;
                curr = curr.next;
            }
        }

        // Reverse the resultant linked list to get the
        // required linked list
        return reverse(res);
    
    }
    
    static Node trimLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head;
    }
    
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
