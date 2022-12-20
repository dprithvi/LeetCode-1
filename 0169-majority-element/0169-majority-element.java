class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int cut = 0;
        int element = 0;
        for(int i = 0;i<len;i++)
        {
            if(cut == 0)
            {
                element = nums[i];
            }
            if(element == nums[i])
            {
                cut +=1;
            }
            else
            cut -= 1;
        }
        return element;
        
    }
}