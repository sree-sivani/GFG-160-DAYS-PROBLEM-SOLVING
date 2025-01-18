
class Solution {
    int countPairs(int arr[], int target) {
        int res = 0; // Variable to store the count of valid pairs
        
        Arrays.sort(arr); // Sorting the array to enable two-pointer technique
        
        int i = 0, j = arr.length - 1; // Initializing two pointers: one at the start and one at the end
        
        while (i < j) { // Continue until pointers cross
            int sum = arr[i] + arr[j]; // Calculate the sum of the two selected elements
            
            if (sum < target) { 
                // If sum is less than target, all pairs (arr[i], arr[i+1] ... arr[j]) are valid
                res += j - i; // Count all pairs formed with arr[i]
                i++; // Move left pointer forward to check for more pairs
            } else {
                // If sum is greater than or equal to target, move right pointer to decrease sum
                j--;
            }
        }
        
        return res; // Return the total count of valid pairs
    }
}
