class Solution {
    
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int prefix = 0;
        int suffix = 0;
        
        for(int i = 0; i < n; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            
            prefix = prefix * arr[i];
            suffix = suffix * arr[n-1-i];
            
            max = Math.max(max, Math.max(prefix, suffix));
        }
        
        return max;
        
    }
}
