

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        if(root == null){
            return new ArrayList<Integer>();
        }
        
        ArrayList<Integer> res1 = inOrder(root.left);
        res1.add(root.data);
        ArrayList<Integer> res2 = inOrder(root.right);
        
        res1.addAll(res2);
        
        return res1;
    }
}
