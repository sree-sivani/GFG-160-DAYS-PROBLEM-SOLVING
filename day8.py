class Solution:
    def maximumProfit(self, prices):
        """
        Finds the maximum profit possible from a single stock transaction.

        Approach:
        - Use a single loop to iterate through the prices.
        - Track the minimum price seen so far.
        - Calculate profit for every price and update the maximum profit if a larger profit is found.

        Parameters:
        prices (List[int]): List of integers representing stock prices on different days.

        Returns:
        int: The maximum profit achievable, or 0 if no profit is possible.
        """
        # Initialize minimum price to the first price in the list.
        minSoFar = prices[0]

        # Initialize the result variable to store maximum profit.
        res = 0

        # Loop through the prices starting from the second day.
        for i in range(1, len(prices)):
            # Update the minimum price if a smaller price is encountered.
            minSoFar = min(minSoFar, prices[i])

            # Calculate potential profit and update the result if higher.
            res = max(res, prices[i] - minSoFar)

        # Return the maximum profit.
        return res
