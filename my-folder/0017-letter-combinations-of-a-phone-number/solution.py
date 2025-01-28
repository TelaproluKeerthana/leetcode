class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        keyboard = {"2": "abc",
                    "3": "def",
                    "4": "ghi",
                    "5": "jkl",
                    "6": "mno",
                    "7": "pqrs",
                    "8": "tuv",
                    "9": "wxyz"
                    }
        # for i in range(0,len(digits),2):
        #     list1=keyboard[digits[i]]
        #     list2=keyboard[digits[i+1]] if i+1<len(digits) else ''
        #     combs=[]
        #     for i in list1:
        #         for j in list2:
        #             combs.append(i+j)
        #     print(combs)
        
        res=[]
        path=[]
        def dfs(i):
            if(len(digits)==len(path)):
                res.append("".join(path))
                return 
            for digi in keyboard[digits[i]]:
                path.append(digi)
                dfs(i+1)
                path.pop()
        if digits:
            dfs(0)
        return res


            

                

           




        
        
