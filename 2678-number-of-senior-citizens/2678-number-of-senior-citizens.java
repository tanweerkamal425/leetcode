class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            String s = details[i];
            int age = Integer.parseInt(s.substring(11, 13));
            
            if (age > 60) ans++;
        }
        
        return ans;
    }
}