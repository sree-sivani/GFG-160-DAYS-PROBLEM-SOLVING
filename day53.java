import java.util.*; // Importing necessary classes

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length; // Get the length of the array
        int min = Integer.MAX_VALUE; // Variable to store the minimum difference
        List<Integer> list = new ArrayList<>(); // List to store the closest pair
        
        // If there is only one element, return an empty list (no pair can be formed)
        if (n == 1) {
            return list;
        }
        
        Arrays.sort(arr); // Sorting the array to use two-pointer technique
        
        int left = 0, right = n - 1; // Initializing two pointers
        
        while (left < right) { // Continue until pointers cross
            int sum = arr[left] + arr[right]; // Calculate the sum of the two elements
            
            // If the absolute difference between target and sum is smaller than min
            if (Math.abs(target - sum) < min) {
                min = Math.abs(target - sum); // Update the minimum difference
                list = Arrays.asList(arr[left], arr[right]); // Update the closest pair
            }
            
            // Adjust pointers based on sum comparison with target
            if (sum > target) {
                right--; // Move right pointer left to decrease sum
            } else if (sum < target) {
                left++; // Move left pointer right to increase sum
            } else {
                // If exact sum is found, return the pair immediately
                return list;
            }
        }
        
        return list; // Return the closest pair found
    }
}
