import java.util.Arrays;

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int count = 0;

        // Sorting the array to apply the two-pointer approach efficiently.
        Arrays.sort(arr);

        // Iterate over the array starting from the third element (index 2).
        // This element will act as the largest side of a potential triangle.
        for (int i = 2; i < arr.length; i++) {
            int left = 0;          // Pointer for the smallest side
            int right = i - 1;     // Pointer for the middle side

            // Use two-pointer technique to find valid triangles
            while (left < right) {
                // If the sum of the two smaller sides is greater than the largest side,
                // a valid triangle can be formed.
                if (arr[left] + arr[right] > arr[i]) {
                    // All elements between 'left' and 'right' can form a triangle
                    // with arr[i], so we add (right - left) to the count.
                    count += right - left;
                    
                    // Move the right pointer left to check for more possibilities.
                    right--;
                } else {
                    // If sum is not greater, move the left pointer to the right
                    // to try a larger value for the smaller side.
                    left++;
                }
            }
        }
        return count;
    }
}
