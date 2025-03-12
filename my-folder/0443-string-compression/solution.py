class Solution:
    def compress(self, chars: List[str]) -> int:
        #do inplace sorting and return the length
        index = 0
        L = 0
        
        while L < len(chars):
            R = L
            while R < len(chars) and chars[R] == chars[L]:
                R += 1
            
            chars[index] = chars[L]
            index += 1
            
            if R - L > 1:
                count = str(R - L)
            
                for c in range(len(count)):
                    chars[index] = count[c]
                    index += 1
            
            L = R
        
        return index


        
