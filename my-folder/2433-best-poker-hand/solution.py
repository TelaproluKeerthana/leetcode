class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        if (len(set(suits))==1):
            return "Flush"
        rank_counter=Counter(ranks)
        if(max(rank_counter.values())>=3):
            return "Three of a Kind"
        elif(max(rank_counter.values())==2):
            return "Pair"
        else:
            return "High Card"
     
        
