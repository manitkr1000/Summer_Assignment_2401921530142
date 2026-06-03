class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j = 0; //move all non zero element to the front

        for(int i = 0;i<nums.size();i++)
        {
            if(nums[i]!= 0){
                nums[j]=nums[i];
                j++;
            }
        }
        //fill the remaining positions with 0
        while(j<nums.size()){
            nums[j]=0;
            j++;
        }
        
    }
};
