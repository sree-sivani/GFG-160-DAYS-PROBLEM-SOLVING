import java.util.ArrayList;

class Solution {
    // Function to find the subarray with a given sum.
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        // Iterate through the array to consider each starting index.
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;  // Initialize sum for the subarray starting at index 'i'

            // Expand the subarray by adding elements one by one.
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // Add current element to sum

                // If sum matches the target, store 1-based indices and return.
                if (sum == target) {
                    res.add(i + 1);  // Convert 0-based index to 1-based
                    res.add(j + 1);
                    return res;  // Return immediately upon finding the first valid subarray
                }

                // If sum exceeds the target, break out early (optimization).
                if (sum > target) {
                    break;
                }
            }
        }

        // If no valid subarray is found, return [-1] as per problem requirements.
        res.add(-1);
        return res;
    }
}
