class Solution {
    // Function to find the equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int total_sum = 0, left_sum = 0;  // Initialize total sum and left sum

        // Calculate total sum of the array
        for (int num : arr) {
            total_sum += num;
        }

        // Iterate through the array to find the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // Right sum is calculated as total_sum - left_sum - current element
            int right_sum = total_sum - left_sum - arr[i];

            // If left sum is equal to right sum, we found an equilibrium point
            if (left_sum == right_sum) {
                return i;  // Return the index of equilibrium point
            }

            // Update left sum by adding the current element
            left_sum += arr[i];
        }

        return -1;  // No equilibrium point found
    }
}
