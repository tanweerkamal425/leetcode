class Solution {
    public boolean doesAliceWin(String s) {
        //since Alice plays optimally so if she makes a move she wins
        //if she cannot make a move she loses
        //hence if there are vowels present in the substing she can make an optimal move
        
        
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}