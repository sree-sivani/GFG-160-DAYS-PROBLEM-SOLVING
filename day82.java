
/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    int ans=0;
    int depth(Node root)
    {
        if(root==null) return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        
        ans=Math.max(ans, l+r);
        return (1+Math.max(l,r));
    }
    
    int diameter(Node root) {
        // Your code here
        depth(root);
        return ans;
    }
}
