class Solution(object):
  def majorityElement(self, nums):
      """
      :type nums: List[int]
      :rtype: int
      """
      counts = {}
      max_count = 0
      target = None
      for element in nums:
          if element in counts:
              counts[element] += 1
          else:
              counts[element] = 1
          if counts[element] > max_count:
              max_count = counts[element]
              target = element
      return target
