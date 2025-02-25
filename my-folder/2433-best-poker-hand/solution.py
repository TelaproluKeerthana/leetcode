class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        suit_counter=Counter(suits)
        rank_counter=Counter(ranks)
        if(max(suit_counter.values())==5):
            return "Flush"
        elif(max(rank_counter.values())>=3):
            return "Three of a Kind"
        elif(max(rank_counter.values())==2):
            return "Pair"
        else:
            return "High Card"
     
        
