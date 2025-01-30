class Trie:
    def __init__(self):
        self.children={}
        self.isword=False #for marking end of the node
    def add_word(self,word):
        cur=self
        for w in word:
            if w not in cur.children:
                cur.children[w]=Trie()
            cur=cur.children[w]
        cur.isword=True

class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        rows=len(board)
        cols=len(board[0])
        root=Trie()
        for word in words:
            root.add_word(word)
        visit=set()
        res=set()
        def dfs(r,c,node,word):
            if (r<0 or c<0 or r==rows or c==cols or (r,c) in visit or
                board[r][c] not in node.children):
                return 
            visit.add((r,c))
            node=node.children[board[r][c]]
            word+=board[r][c]
            if node.isword:
                res.add(word)
            dfs(r+1,c,node,word) 
            dfs(r-1,c,node,word) 
            dfs(r,c+1,node,word) 
            dfs(r,c-1,node,word)
            visit.remove((r,c))

        for r in range(rows):
            for c in range(cols):
                dfs(r,c,root,'')
        
        return list(res)


            


        
