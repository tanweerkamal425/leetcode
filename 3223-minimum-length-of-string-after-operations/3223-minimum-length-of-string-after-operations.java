class Solution {
    public int minimumLength(String s) {
        //if frequency is odd: delete freq - 1 elements
        //if frequence is even: delete freq - 2 elements
        
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        for (int i = 0; i < n; ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        Set<Character> set = new HashSet();
        set = map.keySet();
        int del = 0;
        
        for (char c : set) {
            int freq = map.get(c);
            del += (freq % 2 == 1) ? freq - 1 : freq - 2;
        }
        
        return n - del;
    }
}