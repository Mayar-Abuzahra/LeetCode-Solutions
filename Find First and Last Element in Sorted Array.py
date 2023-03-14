class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        target_index = []
        for index, element in enumerate(nums):
          if element == target:
            target_index.append(index)
        if target_index == []:
         target_index = [-1, -1]
        else:
          target_index = [target_index[0], target_index[-1]]
        return target_index