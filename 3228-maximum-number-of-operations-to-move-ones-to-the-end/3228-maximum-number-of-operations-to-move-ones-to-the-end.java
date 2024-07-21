class Solution {
    public int maxOperations(String s) {
        //track how many 1s are before 0
        //for each 0 encountered the previous ones will move past it
        //for every 0 add total encounted 1s to ans;
        int ans = 0;
        int cnt = 0;
        int n = s.length();
        
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '0') {
                ans += cnt;
                while (i < n && s.charAt(i) != '1') {
                    i++;
                }
            }
            cnt++;
        }
        
        return ans;
    }
}