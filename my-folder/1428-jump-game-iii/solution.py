class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        if arr[start] == 0:
            return True
        queue = [start]
        visited = set()
        while queue:
            node = queue.pop(0)
            if node in visited:
                continue
            visited.add(node)
            if (arr[node] + node < len(arr)):
                if (arr[arr[node] + node] == 0):
                    return True
                queue.append(arr[node] + node)
            if (node - arr[node] > -1):
                if (arr[arr[node] - node] == 0):
                    return True
                queue.append(node - arr[node])
        
        return False



        
