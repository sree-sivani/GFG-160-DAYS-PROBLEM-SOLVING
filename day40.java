class Solution {
    // Function to search a given number in a row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // Initialize a flag to track if the number is found
        boolean ans = false; 

        // Get the number of rows in the matrix
        int rows = mat.length; 

        // Iterate through each row of the matrix
        for (int i = 0; i < rows; i++) {
            // Get the number of columns in the current row
            int cols = mat[i].length; 

            // Check if the target number 'x' is equal to the last element of the row
            if (x == mat[i][cols - 1]) { 
                // If found, set the flag to true and return immediately
                ans = true; 
                return ans; 
            } 

            // Check if the target number 'x' could potentially be in this row 
            // by comparing it with the last element of the row
            if (x < mat[i][cols - 1]) { 
                // Iterate through each element in the current row
                for (int j = 0; j < cols; j++) { 
                    // Check if the current element is equal to the target number
                    if (mat[i][j] == x) { 
                        // If found, set the flag to true and return immediately
                        ans = true; 
                        return ans; 
                    }
                }
            }
        }

        // If the number is not found after iterating through all rows, return false
        return ans; 
    }
}
