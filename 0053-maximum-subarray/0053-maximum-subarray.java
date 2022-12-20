class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxi = nums[0];
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            sum+=nums[i];
            if(sum>maxi)
            {
                maxi = sum;
            }
            if(sum<0)
            {
                sum = 0;
            }
        }
        return maxi;
        
    }
}