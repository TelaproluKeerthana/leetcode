class Solution:
    def compress(self, chars: List[str]) -> int:
        i = 0
        index = 0 #index is to keep track of until which position we compressed the existing string
        # this is a inplace sorting problem with string compression
        while i < len(chars):
            j = i
            while (j < len(chars) and chars[i] == chars[j]):
                j += 1
            
            chars[index] = chars[i]
            index += 1
            if (j - i > 1):
                count = str(j - i)
                for c in range(len(count)):
                    chars[index] = count[c]
                    index += 1
            i = j

        return index
            # if(s[i-1] != s[i]):
            #     res_string.append(s[i])
            #     res_string.append(i)
            # elif s[i - 1] == s[i]:
            #     i +=1


        

        
