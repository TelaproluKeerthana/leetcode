class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        indegree = [0] * numCourses
        adj_list = defaultdict(list)
        for crs, pre in prerequisites:
            adj_list[pre].append(crs)
            indegree[crs] += 1
        
        queue = deque([crs for crs in range(numCourses) if indegree[crs] == 0])
        
        visited = 0
        while queue:
            curr_course = queue.popleft()
            visited += 1
            for nei in adj_list[curr_course]:
                indegree[nei] -= 1
                if(indegree[nei] == 0):
                    queue.append(nei)
        
        if visited == numCourses:
            return True
        return False





