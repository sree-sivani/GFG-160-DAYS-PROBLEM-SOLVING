class Solution:
    def maximumProfit(self, prices):
        """
        Calculates the maximum profit that can be achieved from stock trading.

        Approach:
        - Iterate through the stock prices.
        - Add to the result whenever there's a profitable upward trend.

        Parameters:
        prices (List[int]): List of integers representing stock prices on different days.

        Returns:
        int: Maximum profit achievable.
        """
        # Initialize result variable to store cumulative profit.
        res = 0

        # Loop through the price array starting from the second day.
        for i in range(1, len(prices)):
            # If today's price is higher than yesterday's, calculate profit.
            if prices[i] > prices[i - 1]:
                res += prices[i] - prices[i - 1]

        # Return the total accumulated profit.
        return res
