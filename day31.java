class Solution {

    // Function to find a peak element in the array.
    public int peakElement(int[] arr) {
        int min = Integer.MIN_VALUE;  // Placeholder for the lowest possible value.

        // Case 1: If the array has only one element, it is a peak.
        if ((arr.length == 1) && (arr[0] > min)) {
            return 0;
        }

        // Case 2: Check if the first element is a peak.
        if ((arr[0] > min) && (arr[0] > arr[1])) {
            return 0;
        }

        // Case 3: Check if the last element is a peak.
        if ((arr[arr.length - 1] > min) && (arr[arr.length - 1] > arr[arr.length - 2])) {
            return arr.length - 1;
        }

        // Case 4: Traverse the array to find a peak element in between.
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i + 1] > arr[i]) && (arr[i + 1] > arr[i + 2])) {
                return i + 1;
            }
        }

        return -1; // Return -1 if no peak is found (though at least one peak should always exist).
    }
}
