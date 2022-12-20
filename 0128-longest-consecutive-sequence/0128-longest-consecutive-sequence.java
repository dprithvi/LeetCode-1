class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)
        return 0;
        int n = nums.length;
        HashSet<Integer>s=new HashSet<>();
        for(int i =0;i<n;i++){
            s.add(nums[i]);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int j=0;
            if(!s.contains(nums[i]-1)){
                j=nums[i];
                while(s.contains(j)){
                    j++;
                }
                if(ans<(j-nums[i])){
                    ans=j-nums[i];
                }
            }
        }
        return ans;
    }
}
        
    
