class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hash=set(nums)
        max_length=0
        for n in nums:
          if n-1 not in hash:
           count=0
           while n in hash:
            count+=1
            n+=1
           max_length=max(max_length, count)
        return max_length

        