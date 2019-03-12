public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int ret = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (sum <= 0) sum = nums[i];
            else sum += nums[i];

            ret = Math.max(ret, sum);
        }

        return ret;
    }
}
