class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int[] res = new int[k];
        
        for(int i: nums){
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }

        for(int i=0;i<k;i++) {
            int maxKey = 0;
            int maxValue = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            res[i] = maxKey;
            frequency.remove(maxKey);     
        }
        return res;
    }
}
