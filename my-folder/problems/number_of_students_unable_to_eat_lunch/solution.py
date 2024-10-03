class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        sandwichIndex=0
        studentQueue=students.copy()
        while sandwichIndex < len(sandwiches):
            if studentQueue[0]==sandwiches[0]:
                sandwiches.pop(0)
                sandwichIndex=0
            else:
                studentQueue.append(studentQueue[0])
                sandwichIndex+=1

            studentQueue.pop(0)

        return len(studentQueue)
        