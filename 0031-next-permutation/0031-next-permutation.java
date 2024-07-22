class Solution {
    private static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int arr[], int l, int h) {
        while (l < h) {
            swap(arr, l, h);
            l++;
            h--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i, j;

        for (i = n - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int pivot = i;

        //successor
        for (j = n - 1; j >= i + 1; j--) {
            if (nums[j] > nums[pivot]) {
                break;
            }
        }

        int successor = j;
        swap(nums, pivot, successor);
        reverse(nums, pivot + 1, n - 1);

    }
}