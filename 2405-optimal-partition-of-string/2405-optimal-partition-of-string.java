class Solution {
    public int partitionString(String s) {
        int ans = 1;
        int n = s.length();
        boolean map[] = new boolean[26];
        
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (map[c - 'a']) {
                ans += 1;
                map = new boolean[26]; 
            }
            
            map[c - 'a'] = true;
        }
        
        return ans;
    }
}