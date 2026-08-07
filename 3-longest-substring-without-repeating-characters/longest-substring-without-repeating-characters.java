class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<String> set = new HashSet<>();
        int[] count = new int[256];
        int left=0, max=0;
        char[] c = s.toCharArray();

        for(int right=0; right<c.length; right++){
            count[c[right]]++;

            while(count[c[right]]>1){
                count[c[left]]--;
                left++;

            }
            max=Math.max(max,right-left+1);
        }
        return max;

    }
}