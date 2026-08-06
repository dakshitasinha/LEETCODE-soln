class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(getProd(n)%t==0){
                return n;
            }
            n++;
        }
    }

    private int getProd(int num){
        if(num==0) return 0;

        int pro=1;
        while(num>0){
            pro*=num%10;
            num/=10;
        }
        return pro;
    }

}