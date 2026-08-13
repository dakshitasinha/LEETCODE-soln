class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[256]; //freq array
        int max=0, left=0;
        char[] c = s.toCharArray();

        for(int right=0; right<c.length; right++){
            count[c[right]]++;

            while(count[c[right]]>1){
                count[c[left]]--;
                left++;
            }
            max=Math.max(max, right-left+1);
        }
        return max;
    }
}