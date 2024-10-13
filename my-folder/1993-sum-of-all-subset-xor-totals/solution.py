class Solution(object):
    def subsetXORSum(self, nums):
        return (reduce(lambda x, y: x | y, nums)) << (len(nums) - 1)
        
