class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxa=0
        l=0
        r=len(heights)-1
        while l<r:
            mini=min(heights[l],heights[r])
            maxa=max(maxa,mini*(r-l))
            if(heights[l]>heights[r]):
                r-=1
            else:
                l+=1
        return maxa
            
        
