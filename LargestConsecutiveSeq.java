class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int count = 1;

        if(nums.length < 2){
            return nums.length;
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] - nums[i] == 1){
                count++;
             }
            else if(nums[i + 1] == nums[i]) {
                continue;
            }
            else{
                max = Math.max(max,count);
                count = 1;
            }
           // max = Math.max(count, max);
        }

        max = Math.max(count, max);

        return max;
        
    }
}
