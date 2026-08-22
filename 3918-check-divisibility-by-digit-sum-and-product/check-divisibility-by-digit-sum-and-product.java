class Solution {
    public boolean checkDivisibility(int n) {
        if(n%(sumDig(n)+prodDig(n))!=0){
            return false;
        } 
        return true;
    }

    static int sumDig(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    static int prodDig(int num){
        int prod=1;
        while(num>0){
            prod*=num%10;
            num/=10;
        }
        return prod;
    }
}