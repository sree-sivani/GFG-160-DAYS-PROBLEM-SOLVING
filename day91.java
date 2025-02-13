
/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    HashSet<Integer>hs=new HashSet<>();
    boolean BST(Node root,int target)
    {
        if(root != null){
            if(hs.contains(target-root.data))
                return true;
            hs.add(root.data);
        if (BST(root.left, target) || BST(root.right, target))
                return true;
        }
        return false;
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        return BST( root,  target);
    }
}
