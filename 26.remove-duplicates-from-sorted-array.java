/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1,n;
        n=nums.length;
        while(r<n){
            if(nums[l]==nums[r])
                r++;
            else{
                l++;
                nums[l]=nums[r];
                r++;
            }
        }
    return l+1;
    }
}
// @lc code=end

