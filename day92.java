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
    int ind=0;
    void traverse(Node node , ArrayList<Integer> arr){
        if(node==null)return ;
        traverse(node.left,arr);
        arr.add(node.data);
        traverse(node.right,arr);
    }
    
    void fixed(Node node, ArrayList<Integer> arr){
        if(node==null)return;
        fixed(node.left, arr);
        node.data=arr.get(ind);
        ind++;
        fixed(node.right, arr);
    }
    
    void correctBST(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        traverse(root, arr);
        Collections.sort(arr);
        fixed(root, arr);
    }
}
