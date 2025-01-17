class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // Get the size of the array
        int n = arr.length;
        
        // Resultant array to store the final output
        int[] res = new int[n];
        
        // Variable to store the product of all non-zero elements
        int product = 1;
        
        // Flag to check if there is at least one zero in the array
        boolean flag = false;
        
        // Count of zeros in the array
        int count = 0;
        
        // First pass: Calculate product of all non-zero elements and count zeros
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count++; // Increment zero count
                flag = true; // Mark that at least one zero exists
                continue; // Skip multiplication for zero elements
            }
            product *= arr[i]; // Multiply non-zero elements
        }
        
        // If more than one zero exists, all products will be zero
        if(count > 1){
            return res; // Return an array filled with zeros
        }
        
        // Second pass: Compute the final result array
        for(int i  = 0; i < n; i++){
            if(arr[i] != 0 && flag == true){
                res[i] = 0; // If there was a zero, all non-zero elements get zero
            } else if(arr[i] == 0 && flag == true){
                res[i] = product; // If the current element is zero, assign the product
            } else {
                res[i] = product / arr[i]; // If no zero exists, use division
            }
        }
        return res; // Return the final computed array
    }
}
