class Solution:
    def getMinDiff(self, arr, k):
        """
        Finds the minimum difference between the tallest and shortest tower heights 
        after modifying all tower heights by either increasing or decreasing by k.

        Approach:
        - Sort the array to organize the heights in increasing order.
        - Increment the first segment of towers and decrement the rest, iterating through 
          all possible partitions to minimize the difference between the tallest and shortest towers.
        - Ignore partitions where decreasing the height of a tower results in a negative value.

        Parameters:
        arr (List[int]): List of integers representing tower heights.
        k (int): The value by which tower heights can be increased or decreased.

        Returns:
        int: The minimum difference between the tallest and shortest tower heights.
        """
        n = len(arr)

        # Sort the array for logical segmentation of tower groups
        arr.sort()

        # Initial difference between tallest and shortest
        res = arr[n - 1] - arr[0]

        # Traverse through the array to explore different partitions
        for i in range(1, n):
            # Skip partitions leading to negative tower heights
            if arr[i] - k < 0:
                continue

            # Calculate potential minimum and maximum heights
            minH = min(arr[0] + k, arr[i] - k)
            maxH = max(arr[i - 1] + k, arr[n - 1] - k)

            # Update the result with the minimum difference
            res = min(res, maxH - minH)

        return res
