class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double sum=0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        double maxAvg = sum/k;
        for(int j = k; j<nums.size(); j++){
            sum = sum - nums[j-k] + nums[j];
            maxAvg = max(maxAvg, sum/k);
        }
        
        return maxAvg;
    }
};