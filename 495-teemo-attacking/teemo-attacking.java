class Solution {
    public int findPoisonedDuration(int[] ts, int duration) {
        int total=0;
        for(int i=0; i<ts.length-1;i++){
           int gap = ts[i + 1] - ts[i];
           total += Math.min(duration, gap);
        }
        total+=duration;
        return total;
    }
}