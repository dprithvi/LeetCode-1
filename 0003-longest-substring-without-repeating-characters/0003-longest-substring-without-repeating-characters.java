class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int len=s.length();
        HashMap<Character,Integer> mmp = new HashMap<>();
        int left =0,right = 0;
        int n=s.length();
        int len=0;
        while(right<n){
            if(mmp.containsKey(s.charAt(right)))
            left = Math.max(mmp.get(s.charAt(right))+1,left);
            mmp.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        
            return len;

    }
}