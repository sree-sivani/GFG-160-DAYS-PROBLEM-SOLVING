class Solution {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length; // Get the length of the array

        // Iterate through the array to find the k-th missing number
        for (int i = 0; i < n; i++) {
            // The number of missing elements before arr[i] is (arr[i] - (i + 1))
            // If the missing count reaches k before arr[i], return the k-th missing number
            if (arr[i] > (k + i)) {
                return (k + i);
            }
        }

        // If we don't find the missing number within the array, return (k + n)
        // This accounts for cases where k-th missing number is beyond the given array
        return k + n;
    }
}
