class Solution {

    // Function to count pairs in a sorted array whose sum equals the target
    int countPairs(int arr[], int target) {
        int count = 0; // Stores the count of valid pairs
        int n = arr.length;
        int left = 0; // Left pointer
        int right = n - 1; // Right pointer

        // Two-pointer approach to find pairs
        while (left < right) {
            int sum = arr[left] + arr[right]; // Calculate the sum of elements at left and right pointers

            if (sum < target) {
                // If sum is less than target, move left pointer forward to increase sum
                left++;
            } else if (sum > target) {
                // If sum is greater than target, move right pointer backward to decrease sum
                right--;
            } else {
                // If sum matches the target, count this pair
                count++;

                // Check for duplicate elements on the left side
                int l = left + 1;
                int r = right - 1;

                while (l < right && arr[l] == arr[left]) {
                    count++; // Count duplicate pairs
                    l++;
                }

                // Check for duplicate elements on the right side
                while (r > left && arr[r] == arr[right]) {
                    count++; // Count duplicate pairs
                    r--;
                }

                // Move both pointers to the next distinct elements
                left++;
                right--;
            }
        }

        return count; // Return total count of pairs
    }
}
