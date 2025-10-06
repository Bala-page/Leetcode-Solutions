class Solution {
    public int findKthLargest(int[] nums, int k) {
        int large=nums[0];
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            large=q.remove();
        }
        return large;
    }
}