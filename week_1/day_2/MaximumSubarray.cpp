class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currentSum = nums[0];  //currentSum stores the best sum ending at the current position
        int maxSum = nums[0];  //maxSum stores the overall maximum sum found 

        for(int i = 1;i < nums.size();i++)
        {
            currentSum = max(nums[i],currentSum + nums[i]);
            maxSum = max(maxSum,currentSum);

        }
          return maxSum;
    }
};
