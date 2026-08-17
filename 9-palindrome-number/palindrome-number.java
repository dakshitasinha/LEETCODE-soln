class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        int temp=0, rev=0;
        while(x>0){
            temp = x%10;
            rev = (rev*10) + temp;
            x/=10;
        }

        if(orig==rev){
            return true;
        } else{
            return false;
        }
    }
}