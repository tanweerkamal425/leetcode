class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            int cnt0 = 0, cnt1 = 0;
            for (int j = i; j < n; ++j) {
                if (s.charAt(j) == '0') cnt0++;
                if (s.charAt(j) == '1') cnt1++;
                
                if (cnt0 <= k || cnt1 <= k) ans++;
            }
        }
        
        return ans;
    }
}