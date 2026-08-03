class Solution {
    public int longestSubarray(int[] n) {
        int left=0, z=0, max=0;

        for(int right=0; right<n.length; right++){
            if(n[right]==0) z++;

            while(z>1){
                if(n[left]==0){
                    z--;
                }
            left++;
            }
            max=Math.max(max, right-left);
        }
        return max;
    }
}