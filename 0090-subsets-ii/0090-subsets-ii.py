class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def backtrack(path, st):
            res.append(list(path))
            for i in range(st, len(nums)):
                if i > st and nums[i] == nums[i - 1]:
                    continue  
                path.append(nums[i])
                backtrack(path, i + 1)
                path.pop()

        nums.sort()  
        res = []
        backtrack([], 0)
        return res