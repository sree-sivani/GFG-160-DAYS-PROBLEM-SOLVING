class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Initialize a HashMap to store prefix sums and their respective indices
        Map<Integer, Integer> list = new HashMap<>();
        
        // Initialize the map with a base case: prefix sum of 0 at index -1
        list.put(0, -1);
        
        // Initialize variables to track the maximum length and the running prefix sum
        int max_length = 0;
        int prefix_sum = 0;
        
        // Loop through the array to calculate the prefix sum at each index
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the running prefix sum
            prefix_sum += arr[i];
            
            // Check if there's a prefix sum that, when subtracted from the current prefix sum,
            // equals k (this means we found a subarray with sum k)
            if (list.containsKey(prefix_sum - k))
                // Update the max length of the subarray if it's larger than the previous max
                max_length = Math.max(max_length, i - list.get(prefix_sum - k));
            
            // Only put the prefix sum in the map if it hasn't been added before to preserve
            // the earliest index for that particular sum
            list.putIfAbsent(prefix_sum, i);
        }
        
        // Return the length of the longest subarray with sum k
        return max_length;
    }
}
