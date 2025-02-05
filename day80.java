/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s=q.size();
            ArrayList<Integer> tmp=new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                Node t=q.poll();
                tmp.add(t.data);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
