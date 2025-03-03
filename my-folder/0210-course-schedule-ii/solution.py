from collections import defaultdict
class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adj = defaultdict(list)
        indegree = [0] * numCourses
        for crs, pre in prerequisites:
            adj[pre].append(crs)
            indegree[crs] += 1
        course_order = []
       
        def dfs(node):
            course_order.append(node)
            indegree[node] -= 1

            for nei in adj[node]:
                indegree[nei] -= 1
                if( indegree[nei] == 0):
                    dfs(nei)

        for i in range(numCourses):
            if(indegree[i] == 0):
                dfs(i)
            
        return course_order if len(course_order) == numCourses else []

        

        # if numCourses == 1:
        #     return [0]
        # sorted_prereqs = sorted(prerequisites, key = lambda x:(x[1],x[0]))
        # print(sorted_prereqs)
        # res= set()
        # order=[]
        # for crs,preq in sorted_prereqs:
        #     if preq not in res:
        #         order.append(preq)
        #         res.add(preq)
        #     if crs not in res:
        #         order.append(crs)
        #         res.add(crs)
        
        # return order

