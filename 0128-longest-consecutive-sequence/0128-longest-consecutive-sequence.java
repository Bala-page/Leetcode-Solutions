class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])  continue;
            if(nums[i+1]!=nums[i]+1){
                max=Math.max(max,count);
                count=0;
            }
            count++;
            max=Math.max(max,count);
        }
        return max;
    }
}