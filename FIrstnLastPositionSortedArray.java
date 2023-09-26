class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = findFirstIndex(nums,target);
        res[1] = findLastIndex(nums,target);
        return res;
    }

    public int findFirstIndex(int[] nums, int target){
        int index = -1;
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

            if(nums[mid] == target)  index = mid;
        }
        return index;
    }

    public int findLastIndex(int[] nums, int target){
        int index = -1;
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

            if(nums[mid] == target)  index = mid;

        }
        return index;
    }
}
