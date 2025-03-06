class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        max_heap = [-nums[i] for i in range(len(nums))]
        heapq.heapify(max_heap)
        k_largest = k
        k_largest_value = 0
        while (k_largest > 0):
            k_largest_value = heapq.heappop(max_heap)
            k_largest -= 1
        return -1 * k_largest_value

        

