class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        numSet1 = set(nums1)
        numSet2 = set(nums2)
        return list(numSet1 & numSet2)
