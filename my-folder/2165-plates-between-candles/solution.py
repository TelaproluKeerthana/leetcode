class Solution:
    def platesBetweenCandles(self, s: str, queries: List[List[int]]) -> List[int]:
        s_length = len(s)
        res = []
        
        total_stars = [0] * len(s)
        closest_right_bar = [-1] * len(s)
        closest_left_bar = [-1] * len(s)
        
        stars = 0
        for i in range(s_length):
            if s[i] == "*":
                stars += 1
            total_stars[i] = stars
        
        first_bar = -1
        for i in range(s_length):
            if s[i] == "|":
                first_bar = i
            closest_right_bar[i] = first_bar
        
        last_bar = -1
        for i in range(s_length - 1, -1, -1):
            if s[i] == "|":
                last_bar = i
            closest_left_bar[i] = last_bar 
        
        for l,r in queries:
            left =  closest_left_bar[l]
            right = closest_right_bar[r]
            if (left != -1 and right != -1 and left < right):
                stars_count = total_stars[right] - total_stars[left]
                res.append(stars_count)  
            else:
                res.append(0)
        return res
        
# |**|
# 2,5
# s = "**|**|***|" 

# s =  * * | * * | * * * |
#                l       r
#                c 
# l = 5 r = 9        
# queries = [[2,5],[5,9]]
# prefix = [1 2 2 3 4 4 5 6 7 7]
#               l     5

# s = * * | * * | * * * |
#         l     7
# query = [1, 7]
# res = [2]
