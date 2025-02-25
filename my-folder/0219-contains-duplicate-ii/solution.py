class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # return len(set(nums))==len(nums)
        freq_counter={}
        for i in range(len(nums)):
            if nums[i] in freq_counter and (i-freq_counter[nums[i]]<=k):
                return True
            freq_counter[nums[i]]=i
        return False

            # else:
            #     freq_counter[nums[i]].append(i)
        # res_arr=[]
        # for key,values in freq_counter.items():
        #     if len(values)>1:
        #         res_arr=values 
        # print(res_arr)
        # for i in range(1,len(res_arr)):
        #     if(abs(res_arr[i]-res_arr[i-1])<=k):
        #         continue
        #     return False
        # return True




        
