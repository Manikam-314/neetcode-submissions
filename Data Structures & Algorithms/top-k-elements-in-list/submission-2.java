class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> freq=new HashMap<>();

        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(          
          (a, b) -> freq.get(b) - freq.get(a));

                pq.addAll(freq.keySet());

            int[] val=new int[k];

  for (int i = 0; i < k; i++) {
            val[i] = pq.poll();
        }

        return val;
            }
}
