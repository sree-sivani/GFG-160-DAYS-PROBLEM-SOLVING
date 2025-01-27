class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        
        int n = a.length;
        int m = b.length;
        
        for(int i = 0; i < n; i++){
            set.add(a[i]);
        }
        
        for(int j = 0; j < m; j++){
            set.add(b[j]);
        }
        
        return set.size();
    }
}
