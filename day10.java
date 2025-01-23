// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        int currSum = 0;
        int maxSum = arr[0];
        
        for(int num : arr){
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
        
    }
}
