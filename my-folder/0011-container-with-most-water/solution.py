class Solution:
    def maxArea(self, height: List[int]) -> int:
        L = 0 
        R = len(height) - 1
        max_area = float("-inf")
        while L < R :
            max_area = max(max_area, min(height[L], height[R]) * (R - L))
            if height[R] < height[L]:
                R -= 1
            else: L+=1
           
    
        return max_area

        
