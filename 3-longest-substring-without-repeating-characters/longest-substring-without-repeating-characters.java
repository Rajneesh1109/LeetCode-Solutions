class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }
        
        for (int left = 0, right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, lastIndex[currentChar] + 1);
            maxLength = Math.max(maxLength, right - left + 1);
            lastIndex[currentChar] = right;
        }
        
        return maxLength;
    }
}