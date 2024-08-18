class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                int cnt0 = 0, cnt1= 0;
                for (int l = i; l <= j; ++l) {
                    char c = s.charAt(l);
                    if (c == '0') {
                        cnt0++;
                    }
                    if (c == '1') {
                        cnt1++;
                    }
                }
                
                if (cnt0 <= k || cnt1 <= k) {
                    ans++;
                }
            }
        }
        
        return ans;
    }
}