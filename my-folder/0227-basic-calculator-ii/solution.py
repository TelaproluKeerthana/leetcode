class Solution:
        def calculate(self, s: str) -> int:

            i = 0
            curr = prev = res = 0  # Initialize result, current number, and previous number
            curr_operation = '+'  # Start with addition as the default operation
            
            while i < len(s):
                curr_char = s[i]

                # If the character is a digit, build the full number (handles multi-digit numbers)
                if curr_char.isdigit():
                    while i < len(s) and s[i].isdigit():
                        curr = curr * 10 + int(s[i])  # Construct the number
                        i += 1

                    i -= 1  # Adjust index back since loop moves one extra step
                    
                    # Perform the previous stored operation
                    if curr_operation == '+':
                        res += curr
                        prev = curr  # Store the last added value
                    elif curr_operation == '-':
                        res -= curr
                        prev = -curr  # Store as negative for later corrections
                    elif curr_operation == '*':
                        # Undo previous operation, then apply multiplication
                        res -= prev
                        res += prev * curr
                        prev = prev * curr  # Update prev to reflect new multiplication
                    elif curr_operation == '/':
                        # Undo previous operation, then apply integer division
                        res -= prev
                        res += int(prev / curr)
                        prev = int(prev / curr)  # Update prev with new division result

                    curr = 0  # Reset current number for the next operation
                
                # If the character is an operator (excluding spaces), update the operation to perform next
                elif curr_char != " ":
                    curr_operation = curr_char
                
                i += 1  # Move to the next character

            return res

                


                



        

            
            


       
