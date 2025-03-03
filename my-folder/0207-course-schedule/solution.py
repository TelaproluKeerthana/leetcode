class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adj = defaultdict(list)
        for crs, pre in prerequisites:
            adj[crs].append(pre)
        # now you get which course should be completed in order to proceed with the course
        visit = set()
        def dfs(crs):
            if adj[crs] == []:
                return True
            if crs in visit:
                return False
                #that means you encountered a cycle and you can't make it to complete the course.
            visit.add(crs)
            for nei in adj[crs]:
                if not dfs(nei):
                    return False
            visit.remove(crs)
            adj[crs] = []
            # for faster return when we are looking up for that node
            return True
        
        for c in range(numCourses):
            if not dfs(c):
                return False
        return True
            

