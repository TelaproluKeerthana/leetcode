class Solution:
    def calculate(self, s: str) -> int:
        i = 0
        # to keep track of the curr position
        curr = prev = res = 0
        curr_operation = '+'
        while(i < len(s)):
            curr_char = s[i]

            if(curr_char.isdigit()):
                while i < len(s) and s[i].isdigit():
                    curr = curr * 10 + int(s[i])
                    i += 1

                i -= 1

                if curr_operation == '+':
                    res += curr
                    prev = curr
         #storing prev so if we encounter a * or / then you use prev and start computing it again
                elif curr_operation == '-':
                    res -= curr
                    prev = -curr
                elif curr_operation == '*':
                    res -= prev
                    res += curr * prev

                    prev = curr * prev
                else:
                    res -= prev
                    res += int(prev / curr)
                    prev = int(prev / curr)
                
                curr = 0
                #must reset to 0 after performing the operation
            elif curr_char != " ":
                curr_operation = curr_char
            
            i += 1
        return res

                


                



        

            
            


       
