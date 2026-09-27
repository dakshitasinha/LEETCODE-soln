class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        for(int kid:candies){
            maxi=Math.max(maxi,kid);
        }

        List<Boolean> res = new ArrayList<>();

        for(int i=0; i<candies.length; i++){
            res.add(candies[i]+extraCandies >= maxi);
        }

        return res;

    }
}