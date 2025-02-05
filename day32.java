
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        int[] mergedArr = new int[n+m];
        
        for(int i = 0; i < n; i++){
            mergedArr[i] = a[i];
        }
        
        for(int i = 0; i < m; i++){
            mergedArr[n+i] = b[i];
        }
        
        Arrays.sort(mergedArr);
        return mergedArr[k-1];
    }
}
