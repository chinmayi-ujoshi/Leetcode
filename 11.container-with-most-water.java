/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max=0, r=height.length-1,l=0;
        while(r>l){
            if(height[l]<height[r]){
                int area=(r-l)*(height[l]);
                if(area>max)
                    max=area;
                l++;
            }
            else{
                int area=(r-l)*(height[r]);
                if(area>max)
                    max=area;
                r--;
            }
        }
        return max;
    }
}
// @lc code=end

