
/*
class Node {
    int data;
    Node next, random;

    Node(int d)
    {
        data = d;
        next = random = null;

    }
}*/

class Solution {
    // Function to clone a linked list with next and random pointer.
    Node cloneLinkedList(Node head) {
        // your code here
        Node currnode=head;
        while(currnode!=null)
        {
            Node nextnode=currnode.next;
            Node newnode=new Node(currnode.data);
            currnode.next=newnode;
            currnode=currnode.next;
            currnode.next=nextnode;
            currnode=currnode.next;
        }
        Node newhead=head.next;
        currnode=head;
        Node currnode1=newhead;
        while(currnode1!=null)
        {
            if(currnode.random!=null)
            {
                currnode1.random=currnode.random.next;
            }
            currnode=currnode.next.next;
            if(currnode==null)
            {
                break;
            }
            currnode1=currnode1.next.next;
        }
        currnode=head;
        currnode1=newhead;
        while(currnode!=null)
        {
            currnode.next=currnode.next.next;
            currnode1.next=currnode1.next.next;
            currnode=currnode.next;
            currnode1=currnode1.next;
            if(currnode1.next==null)
            {
                currnode.next=null;
                break;
            }
        }
        return newhead;
    }
}
