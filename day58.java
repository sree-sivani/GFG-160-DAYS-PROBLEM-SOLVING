class Solution {
    // Function to find the length of the longest substring with unique characters.
    public int longestUniqueSubstr(String s) {
        int[] arr = new int[26]; // Array to store the last seen position of each character (assuming lowercase letters).
        int l = 0;  // Left pointer of the sliding window.
        int maxlen = 0;  // Stores the maximum length of unique substring.

        // Iterate through the string with the right pointer.
        for (int r = 0; r < s.length(); r++) {
            int charIndex = s.charAt(r) - 'a';  // Convert character to index.

            // If the character has already been seen, move the left pointer to avoid duplicates.
            if (arr[charIndex] != 0) {
                l = Math.max(l, arr[charIndex]); // Update left pointer to the last seen position +1.
            }

            // Update the last seen position of the character.
            arr[charIndex] = r + 1;

            // Calculate the maximum length of the unique substring.
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}
