/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }

        int l=0,r=n-1;
        for(int j=n-1;j>=0;j--){
            if(nums[l]<nums[r]){
                arr[j]=nums[r];
                r--;
            }
            else{
                arr[j]=nums[l];
                l++;                
            }
            // else{
            //     arr[j]=nums[l];
            //     //arr[j-1]=nums[r];
            //     l++;
            //     r--;
            // }
        }
        return arr;
    }
}
// @lc code=end

