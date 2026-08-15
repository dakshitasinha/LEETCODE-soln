class Solution {
    public int[] replaceElements(int[] arr) {
   if(arr.length<=1) return new int[] {-1};

        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i]=-1;
                continue;
            }
            int max=Integer.MIN_VALUE; 
            for(int j=i+1; j<arr.length; j++){
                max=Math.max(max, arr[j]);
                
            }
            arr[i]=max;
        }
        return arr;
    }
}