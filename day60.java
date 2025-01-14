class Solution {

    // Function to find the maximum water that can be trapped between two buildings.
    public int maxWater(int arr[]) {
        // Edge case: If there's only one building, no water can be trapped.
        if (arr.length == 1) {
            return 0;
        }

        int i = 0;                 // Left pointer
        int j = arr.length - 1;    // Right pointer
        int res = 0;               // Stores the maximum trapped water

        // Use two-pointer approach to find the maximum water trapped
        while (i < j) {
            // Calculate the area using the smaller height and width between i and j
            int area = Math.min(arr[i], arr[j]) * (j - i);
            
            // Update the maximum result
            res = Math.max(res, area);

            // Move the pointer pointing to the smaller height to explore better options
            if (arr[i] > arr[j]) {
                j--;  // Move right pointer leftwards
            } else if (arr[i] < arr[j]) {
                i++;  // Move left pointer rightwards
            } else {
                // If both are equal, move both pointers inward
                i++; 
                j--;
            }
        }

        return res;  // Return the maximum water trapped
    }
}
