class Solution(object):
    def dailyTemperatures(self, temperatures):
        """
        :type temperatures: List[int]
        :rtype: List[int]
        """
        stack=[]
        res=[0]*len(temperatures)
        for i,val in enumerate(temperatures):
            while stack and val>stack[-1][0]:
                valval,vali=stack.pop()
                res[vali]=i-vali
            stack.append((val,i))
        return res
        
