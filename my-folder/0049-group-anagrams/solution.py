class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm=defaultdict(list)

        for s in strs:
            key=[0]*26
            for c in s:
                key[ord(c)-ord('a')]+=1
            immutable_key=tuple(key)
            hm[immutable_key].append(s)
        group=[]
        for i in hm.values():
            group.append(i)
        return group


            
        print(hm)



        #     keys=Counter(s)
        #     key_pair=''
        #     for key in keys:
        #         key_pair+=key
        #     key_pair=tuple(key_pair)
        #     hm[key_pair]+=1 if key_pair in hm else 1
        # print(hm)
            
        
