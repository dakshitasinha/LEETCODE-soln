class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();

        String last = trimmed.substring(trimmed.lastIndexOf(" ") + 1);

        return last.length();
    }
}