class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int l[]=new int[2];
        HashMap<Integer,Integer> hello = new HashMap<Integer,Integer>();
        for(int i =0;i<len;i++)
        {
            if(hello.containsKey(target-nums[i]))
            {
                l[1]=hello.get(target-nums[i]);
                l[0]=i;
            }
            else
            {
                hello.put(nums[i],i);
            }
        }
        return l;
        
    }
}