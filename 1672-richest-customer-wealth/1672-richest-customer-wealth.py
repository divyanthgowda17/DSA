class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        max_wealth = 0

        for customer in accounts:
            wealth = 0
            for i in customer:
                wealth += i

            if wealth > max_wealth:
                max_wealth = wealth
        return max_wealth