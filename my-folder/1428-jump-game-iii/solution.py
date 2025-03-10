class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        if arr[start] == 0:
            return True
        
        visited = [False] * len(arr)
        
        def dfs(idx):
            
            if (idx < 0 or idx >= len(arr) or visited[idx]):
                return False
            
            if (arr[idx] == 0):
                return True
            visited[idx] = True

            right = dfs(idx + arr[idx]) 
            left = dfs(idx - arr[idx])
                
            return left or right

        return dfs(start)
        
