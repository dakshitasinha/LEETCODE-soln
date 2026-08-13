class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq=0, left=0, ans=0;

        for(int right=0; right<s.length(); right++){
            int index = s.charAt(right)-'A';
            count[index]++;

            maxFreq = Math.max(maxFreq, count[index]);
            int window = right-left+1;
            int replace = window-maxFreq;

            while(replace>k){
                count[s.charAt(left)-'A']--;
                left++;

                window = right-left+1;
                replace = window-maxFreq;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;

    }
}