class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int left=0, right=p.length-1;
        int boat=0;

        while(left<=right){
            if(p[left]+p[right]<=limit){
                boat++;
                left++;
                right--;
            } else if(p[left]+p[right]>limit){
                boat++;
                right--;
            } 
        }
    return boat;
    }
}