class Solution {
    public int findMin(int[] arr) {
        // Initialize pointers for binary search
        int left = 0; 
        int right = arr.length - 1;

        // Binary search to find the minimum element
        while (left < right) {
            int mid = left + (right - left) / 2; 

            // If the middle element is smaller than the rightmost element,
            // the minimum element lies in the left half (or at mid)
            if (arr[mid] < arr[right]) {
                right = mid; 
            } 
            // If the middle element is greater than the rightmost element,
            // the minimum element lies in the right half
            else { 
                left = mid + 1;
            }
        }

        // After the loop, 'left' will point to the index of the minimum element
        return arr[left]; 
    }
}
