
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (
           (a[0] * a[0] + a[1] * a[1]) -  (b[0] * b[0] + b[1] * b[1]) 
                                                                )
                                                        );
        int [][] ans = new int[k][2]; 
        
        for(int [] arr : points) pq.offer(arr);
        
        for(int i = 0 ; i < k ; i++){
            int [] now = pq.poll();
            ans[i][0] = now[0];
            ans[i][1] = now[1];
        }
        
        return ans;
    }
}
