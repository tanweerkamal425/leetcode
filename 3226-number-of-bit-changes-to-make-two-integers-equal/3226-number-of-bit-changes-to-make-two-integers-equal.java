class Solution {
    public int minChanges(int n, int k) {
        int cnt = 0;
        //for int traverse 32 bits if bit is 1 in n and 0 in k cnt increases else if bit is 0 in n and 1 in k conversion is not possible
        for (int i = 0; i < 32; ++i) {
            int a = (n & (1 << i));
            int b = (k & (1 << i));
            if (a == 0 && b != 0) return -1;
            if (a != 0 && b == 0) cnt++;
        }
        
        return cnt;
        
    }
}