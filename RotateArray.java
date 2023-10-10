//tc = O(n)
//sc = o(1)
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null && nums.length == 0)
            return;
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}