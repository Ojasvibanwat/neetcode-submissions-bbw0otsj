class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int num : nums){
            if(zeroCount >1){
                product = 0;
                break;
            }
            if(num == 0) {
                zeroCount ++;
            }
            else {
                product *=num;
            }
        }
        int length = nums.length;
        int[] res = new int[length];
        if(zeroCount>1) {
            java.util.Arrays.fill(res, 0);
            return res;
        }
        for(int i = 0; i<length; i++) {
            if(nums[i] == 0) {
                res[i] = product;
            }
            else if(zeroCount == 0){
                res[i] = product/nums[i];
            }
            else {
                res[i] = 0;
            }
        }
        return res;
    }
}  
