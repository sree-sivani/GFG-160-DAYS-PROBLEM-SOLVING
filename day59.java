class Solution {
    // Function to calculate the maximum amount of water that can be trapped.
    public int maxWater(int arr[]) {
        int n = arr.length;
        
        // Arrays to store the maximum height to the left and right of each element.
        int left[] = new int[n];
        int right[] = new int[n];

        // Initialize the leftmost boundary.
        left[0] = arr[0];

        // Initialize the rightmost boundary.
        right[n - 1] = arr[n - 1];

        // Compute the maximum height to the left of each element.
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        // Compute the maximum height to the right of each element.
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        int ans = 0;

        // Calculate the trapped water at each position.
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }

        return ans;
    }
}
