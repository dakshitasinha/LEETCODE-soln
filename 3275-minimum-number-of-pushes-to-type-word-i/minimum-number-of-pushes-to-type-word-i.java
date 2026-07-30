class Solution {
    public int minimumPushes(String word) {
        int count=0;
        
        for(int i=0; i<word.length(); i++){
            int x=i/8;
            count+=(x+1);
        }
        return count;

    }
}