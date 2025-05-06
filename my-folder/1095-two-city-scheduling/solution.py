class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        min_cost = 0
        costs.sort(key=lambda cost:cost[0] - cost[1])
        print(costs)
        n = len(costs) // 2

        for i in range(n):
            min_cost += costs[i][0]
        
        for i in range(n, 2 * n):
            min_cost += costs[i][1]

        return min_cost

        
        



        

        
