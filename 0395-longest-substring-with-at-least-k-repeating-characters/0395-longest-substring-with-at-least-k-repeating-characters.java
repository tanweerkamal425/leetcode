class Solution {
    public int longestSubstring(String s, int k) {
        return longestSubstringUtil(s, 0, s.length(), k);
    }

    int longestSubstringUtil(String s, int start, int end, int k) {
        //if length of string is less than k, simply return 0
        if (end < k) return 0;
        int[] map = new int[26];
        
        // update the countMap with the count of each character
        for (int i = start; i < end; i++)
            map[s.charAt(i) - 'a']++;
        
        for (int mid = start; mid < end; mid++) {
            
            if (map[s.charAt(mid) - 'a'] >= k) continue;
            
            int midNext = mid + 1;
            
            while (midNext < end && map[s.charAt(midNext) - 'a'] < k) midNext++;
            
            return Math.max(longestSubstringUtil(s, start, mid, k),
                    longestSubstringUtil(s, midNext, end, k));
        
        }
        return (end - start);
    }
}
