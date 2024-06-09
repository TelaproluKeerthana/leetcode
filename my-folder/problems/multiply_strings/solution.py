class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        res=[0]*(len(num1)+len(num2))
        if num1=='0' or num2=='0':
            return "0"
        num1=num1[::-1]
        num2=num2[::-1]
        for i in range(len(num1)):
            for j in range(len(num2)):
                digi=(int(num1[i])*int(num2[j]))
                res[i+j]+=digi
                res[i+j+1]+=(res[i+j]//10)
                res[i+j]=res[i+j]%10
        beg,res=0,res[::-1]
        while(len(res)>0 and res[beg]==0):
            beg+=1
        return "".join(map(str,(res[beg:])))

        


        
        