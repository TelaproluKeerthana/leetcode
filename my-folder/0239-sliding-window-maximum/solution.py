class Solution(object):
    #que is used to store indices of the array
    def maxSlidingWindow(self, nums, k):
        l,r=0,0
        que=deque()
        res=[]
        while(r<len(nums)):
            while(que and nums[que[-1]]<nums[r]):
                que.pop()
            que.append(r)
            if l>que[0]:
                que.popleft() 
                #when l passes the indices that's stored on top of the queue
            if r+1>=k:
                res.append(nums[que[0]])
                l+=1
            r+=1
        return res


        

