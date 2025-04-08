class Solution:
    def findRadius(self, houses: List[int], heaters: List[int]) -> int:
        heaters.sort()
        max_radius = float("-inf")
        for house in houses:
            max_radius = max(max_radius, self.closest_distance(heaters, house))
        
        return max_radius


    def closest_distance(self, heaters, house):
        l = 0 
        r = len(heaters) - 1
        min_dist = float("inf")
        while l <= r:
            mid = (l + r) // 2
            min_dist = min(min_dist, abs(heaters[mid] - house))
            if heaters[mid] < house:
                l = mid + 1
            else:
                r = mid - 1
        
        return min_dist
        



        
