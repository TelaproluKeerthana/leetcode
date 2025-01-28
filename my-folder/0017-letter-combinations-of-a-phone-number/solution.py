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
        if not digits:
            return []
        # for i in range(0,len(digits),2):
        #     list1=keyboard[digits[i]]
        #     list2=keyboard[digits[i+1]] if i+1<len(digits) else ''
        #     combs=[]
        #     for i in list1:
        #         for j in list2:
        #             combs.append(i+j)
        #     print(combs)
        res=['']
        for d in digits:
            if d in keyboard:
                new_res=[]
                for comb in res:
                    for letter in keyboard[d]:
                        new_res.append(comb+letter)
                res=new_res
        return res
                

           




        
        
