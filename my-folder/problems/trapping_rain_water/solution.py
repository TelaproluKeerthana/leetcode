class Solution:
    def trap(self, height: List[int]) -> int:
        arr=height
        # take two arrays
        left_max=[0]*len(arr)
        right_max=[0]*len(arr)
        left_max[0]=arr[0]
        for i in range(1,len(arr)):
            left_max[i]=max(left_max[i-1],arr[i])

        right_max[len(arr)-1]=arr[len(arr)-1]
        for i in range(len(arr)-2,0,-1):
            right_max[i]=max(arr[i],right_max[i+1])



        trapped_Water =0
        for i in range(0,len(arr)):
            water_trapped= min(left_max[i],right_max[i])
            if(water_trapped>0):
                trapped_Water += water_trapped-arr[i]
        return trapped_Water


        