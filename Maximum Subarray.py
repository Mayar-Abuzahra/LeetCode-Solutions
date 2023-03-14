class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_till_now = nums[0]
        max_ending = 0

        for i in range(0, len(nums)):
            max_ending += nums[i]
            if (max_ending < 0):
                max_ending = 0
            if (max_till_now < max_ending):
                max_till_now = max_ending
        if(max_till_now == 0):
            return max(nums)
        else:
            return max_till_now