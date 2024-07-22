class Solution {
    public int partitionString(String s) {
        int ans = 1;
        int n = s.length();
        boolean map[] = new boolean[26];
        
        for (int i = 0; i < n; ++i) {
            if (!map[s.charAt(i) - 'a']) {
                map[s.charAt(i) - 'a'] = true;
                continue;
            } else {
                ans += 1;
                map = new boolean[26];
                map[s.charAt(i) - 'a'] = true;
            }
        }
        
        return ans;
    }
}