class Solution:
    def dividePlayers(self, skill: List[int]) -> int:
        skill.sort()
        firstPair=skill[0]+skill[-1]
        targetSum=0
        n=len(skill)
        for i in range(n//2):
            if (skill[i]+skill[n-i-1]!= firstPair):
                return -1
            targetSum+=skill[i]*skill[n-i-1]
        return targetSum
        