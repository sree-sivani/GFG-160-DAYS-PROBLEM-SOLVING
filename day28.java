class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length; // Get the length of the array
        int idx = 0; // Variable to store the index where target is found
        int count = 0; // Variable to count occurrences of target
        
        // Find the first occurrence of the target in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                idx = i - 1; // Set idx before the first occurrence
                break; // Exit loop once target is found
            }
        }
        
        // Count consecutive occurrences of the target after the first occurrence
        while (arr[++idx] == target) { 
            if (idx == n - 1 && arr[idx] == target) { // Check if it's the last element
                count++;
                break;
            }
            count++;
        }
        
        return count; // Return the count of occurrences
    }
}
