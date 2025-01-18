class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length; // Get the length of the array
        int count = 0; // Variable to store the count of valid triplets

        // Iterate through each element in the array, treating it as the first element of the triplet
        for (int i = 0; i < n; i++) {
            int left = i + 1; // Left pointer for the second element
            int right = n - 1; // Right pointer for the third element

            while (left < right) { // Continue until pointers cross
                int sum = arr[i] + arr[left] + arr[right]; // Calculate sum of the triplet

                if (sum < target) {
                    left++; // Increase left pointer to get a larger sum
                } else if (sum > target) {
                    right--; // Decrease right pointer to get a smaller sum
                } else { 
                    // If sum matches the target, count the occurrences of arr[left] and arr[right]
                    int ele1 = arr[left], ele2 = arr[right];
                    int c1 = 0, c2 = 0;

                    // Count occurrences of arr[left]
                    while (left <= right && arr[left] == ele1) {
                        c1++;
                        left++;
                    }

                    // Count occurrences of arr[right]
                    while (right >= left && arr[right] == ele2) {
                        c2++;
                        right--;
                    }

                    // If both elements are the same, use combination formula to count pairs
                    if (ele1 == ele2) {
                        count += (c1 * (c1 - 1)) / 2; // Choosing 2 from c1 (nC2 formula)
                    } else {
                        count += (c1 * c2); // Multiply counts of distinct elements
                    }
                }
            }
        }

        return count; // Return total count of valid triplets
    }
}
