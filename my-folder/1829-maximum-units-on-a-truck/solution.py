class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        total_units = 0
        capacity = truckSize
        boxTypes.sort(key = lambda x: x[1], reverse = True)
        print(boxTypes)
        for boxes, units in boxTypes:
            if( capacity >= boxes):
                total_units += boxes * units
                capacity -= boxes
            elif (capacity > 0 ):
                total_units += capacity * units
                break
        
        return total_units
            

            
        
