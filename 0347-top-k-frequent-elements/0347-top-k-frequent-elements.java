class Solution {

    class pair{
        int num,freq;
        public pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[k];
        int count=0;
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b) -> a.freq-b.freq);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pair curr=new pair(entry.getKey(),entry.getValue());
            if(pq.size() < k){
                pq.add(curr);
            }
            else if(curr.freq > pq.peek().freq){
                pq.remove();
                pq.add(curr);
            }
        }
        while(!pq.isEmpty()){
            ans[count++]=pq.remove().num;
        }
        return ans;
    }
}