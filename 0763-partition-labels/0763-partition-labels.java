class Solution {
    public List<Integer> partitionLabels(String s) {    
        int last[] = new int[26];
        int n = s.length();
        
        for (int i = 0; i < n; ++i) {
            last[s.charAt(i) - 'a'] = i;
        }
        
        List<Integer> ans = new ArrayList<>();
        int prev = -1, maxImpactIdx = 0;
        for (int i = 0; i < n; ++i) {
            maxImpactIdx = Math.max(maxImpactIdx, last[s.charAt(i) - 'a']);
            if (maxImpactIdx == i) {
                ans.add(maxImpactIdx - prev);
                prev = maxImpactIdx;
            }
        }
        
        return ans;
        
    }
}