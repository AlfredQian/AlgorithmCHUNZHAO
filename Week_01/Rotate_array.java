//创建额外数组
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i =0; i <n; ++i) {
            arr[(i+k)%n] = nums[i];
        }
        System.arraycopy(nums,0,arr,0,n);
    }
}
