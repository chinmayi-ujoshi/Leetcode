/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int L=0,R=1;
        while(R<nums.length){
            if(nums[L]!=0){
                L++;
                R++;
            }
            else if(nums[R]==0){
                R++;
            }
            else{//nums[L]=0
                int t=nums[R];
                nums[R]=nums[L];
                nums[L]=t;
            }
        }        
    }
}
// @lc code=end

