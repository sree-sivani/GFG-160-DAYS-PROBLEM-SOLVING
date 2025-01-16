class Solution {
    public int maxLen(int[] arr) {
        // Variable to store the maximum length of the subarray with equal 0s and 1s
        int count = 0;
        // Variable to track the net count of 0s and 1s (treating 0 as +1 and 1 as -1)
        int o = 0;
        // Create a HashMap to store the first occurrence of a given count
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize with 0 at index -1, to handle cases where a valid subarray starts from index 0
        map.put(0, -1);
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Increment 'o' for 0 and decrement for 1 to balance counts
            if (arr[i] == 0) {
                o++;
            } else {
                o--;
            }
            
            // If the current count has been seen before, it means a balanced subarray exists
            if (map.containsKey(o)) {
                // Update the maximum length of the balanced subarray
                count = Math.max(count, i - map.get(o));
            } else {
                // Otherwise, store the first occurrence of this count
                map.put(o, i);
            }
        }
        return count; // Return the maximum length of the balanced subarray
    }
}
