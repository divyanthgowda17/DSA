class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        neg = []
        pos = []

        for num in nums:
            if num < 0:
                neg.append(num)
            else:
                    pos.append(num)

        if len(neg)==0:
            return [x*x for x in pos]
        if len(pos)==0:
            res = [x*x for x in neg]
            res.reverse()
            return res
        
        neg = [x*x for x in neg][::-1]
        pos = [x*x for x in pos]
        res=[]
        i=0
        j=0

        while i < len(neg) and j < len(pos):
            if neg[i]<=pos[j]:
                res.append(neg[i])
                i+=1

            else:
                res.append(pos[j])
                j+=1

        while i < len(neg):
            res.append(neg[i])
            i+=1
        while j < len(pos):
            res.append(pos[j])
            j+=1
        return res




