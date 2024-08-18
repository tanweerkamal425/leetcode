class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int cnt = 0;
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        
        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i - 1] + 1 == nums[i]) {
                cnt++;
            } else {
                cnt = 1;
            }
            
            //checking i + 1 >= k, think when the window starts from 0 a[2] is 3rd element
            if (i + 1 >= k) {
                ans[i - k + 1] = cnt >= k ? nums[i] : -1;
                //cnt >= k because checking consecutive sorted and that can be greater than k in the array
            }
        }
        
        return ans;
    }
}