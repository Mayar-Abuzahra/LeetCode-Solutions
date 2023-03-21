class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        import numpy as np
        import math
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums3 = np.concatenate((nums1, nums2))
        nums3=np.sort(nums3)
        if(len(nums3)%2 != 0):
            median=nums3[int(math.floor(len(nums3)/2))]
        else:
            mid=len(nums3)/2
            median=(nums3[int(mid-1)]+nums3[int(mid)])/2.0
        return median
