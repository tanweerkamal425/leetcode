class Solution {
    public void sortColors(int[] nums) {
        //Dutch flag algorithm
        //0 to low - 1 contain 0s
        //low to mid - 1 contain 1s
        //high + 1 to n - 1 contain 2s
        //array from mid to high is unsorted
        int low = 0;
        int mid = 0;
        int n = nums.length;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}