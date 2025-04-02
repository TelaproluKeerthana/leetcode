class Solution:
    def trap(self, height: List[int]) -> int:
        len_height = len(height) 
        pre = [0] * (len_height)
        suff = [0] * (len_height)
        pre[0] = height[0]
        
        for i in range(1, len_height):
            pre[i] = max(pre[i - 1], height[i])
        
        suff[-1] = height[-1]
        for i in range(len_height - 2, -1 , -1):
            suff[i] = max(height[i], suff[i + 1])
        
        water_trapped = 0
        for i in range(len_height):
            water_trapped += abs(min(suff[i], pre[i]) - height[i])

        return water_trapped
            

        
