class Solution {
    public void reverse(int[] nums, int start, int end){
        int temp = 0;
        while(start < end){
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;

        }
    }
    public void rotate(int[] nums, int k) {
       k = k % nums.length;
       reverse(nums,0, nums.length - 1);
       reverse(nums,0,k - 1);
       reverse(nums,k, nums.length - 1);

        
        
    }
}
