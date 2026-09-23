class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        k = 1
        read = 1
        while(read < len(nums)):
            if (nums[read]!=nums[read-1]):
                nums[k] = nums[read]
                k+=1
            read +=1

        return k
            
