class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int left = 0;
        int count = s1.length();
        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            if (freq[c - 'a'] > 0) {
                count--;
            }
            freq[c - 'a']--;
            if (right - left + 1 > s1.length()) {
                char removed = s2.charAt(left);
                freq[removed - 'a']++;
                if (freq[removed - 'a'] > 0) {
                    count++;
                }
                left++;
            }
            if (count == 0) {
                return true;
            }
        }
        return false;
    }
}