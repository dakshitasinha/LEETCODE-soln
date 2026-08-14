class Solution {
    public boolean isAnagram(String s, String t) {
        //build the frequencies from s
        //subtract frequencies while iterating t
        //if HashMap balances out to zero, anagram->true.
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] arrS = s.toCharArray();
        for(char i:arrS){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        char[] arrT = t.toCharArray();
        for(char c:arrT){
            if(!map.containsKey(c)){
                return false;
            }else{
                map.put(c, map.get(c)-1);
            }
        }
        for(int ch:map.values()){
            if(ch!=0) return false;
        }
        return true;
    }
}