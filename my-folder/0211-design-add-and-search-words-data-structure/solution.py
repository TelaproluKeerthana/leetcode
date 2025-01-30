class TrieNode():
    def __init__(self):
        self.children={}
        self.word=False
class WordDictionary:
    def __init__(self):
        self.root=TrieNode()
    def addWord(self, word: str) -> None:
        curr=self.root
        for w in word:
            if w not in curr.children:
                curr.children[w]=TrieNode()
            curr=curr.children[w]
        curr.word=True    

    def search(self, word: str) -> bool:
        def recsearch(i,root):
            curr=root
            for j in range(i,len(word)):
                c=word[j]
                if c=='.':
                    for child in curr.children.values():
                        if recsearch(j+1,child):
                            return True
                    return False
                else:
                    if c not in curr.children:
                        return False
                    curr=curr.children[c] 
            return curr.word
        return recsearch(0,self.root)
