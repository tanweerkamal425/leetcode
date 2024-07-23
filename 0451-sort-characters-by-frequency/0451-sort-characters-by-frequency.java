class Solution {
    public String frequencySort(String s) {
        // Count the occurence on each character
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sorting
        List<Character> chars = new ArrayList(map.keySet());
        Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));

        // Build string
        StringBuilder sb = new StringBuilder();
        for (Object c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}