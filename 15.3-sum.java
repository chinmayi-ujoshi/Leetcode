/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int n=nums.length;
        if(n<3) return res;

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){
                int curSum=nums[i]+nums[l]+nums[r];
                if(curSum==0){
                    List<Integer> sub = new LinkedList<>();
                    sub.add(nums[i]);
                    sub.add(nums[l]);
                    sub.add(nums[r]);
                    res.add(sub);
                    l++;
                    r--;   
                    
                    while ((l<r && nums[l]==nums[l-1])) 
                    {
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                    
                }
                else if(curSum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

