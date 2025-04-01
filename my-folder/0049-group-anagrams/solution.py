class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = defaultdict(list)
        for word in strs:
            key = "".join(sorted(word))
            hm[key].append(word)
        
        res = []
        for i in hm.values():
            res.append(i)

        return res


        
            
                


        
