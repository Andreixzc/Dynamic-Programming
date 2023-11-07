package LIS;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] nums = {4, 10, 4, 3, 8, 9};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {

        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return lengthOfLIS(nums, memo, nums.length - 1);
    }

    public static int lengthOfLIS(int[] nums, int[] memo, int idx) {
        if (idx == 0) {
            return 1;
        }
        if (memo[idx] != -1) {
            return memo[idx];
        }
        int maxLIS = 1; // Minimum LIS is 1 for the last element itself
        for (int i = 0; i < idx; i++) {
            if (nums[idx] > nums[i]) {
                maxLIS = Math.max(maxLIS, 1 + lengthOfLIS(nums, memo, i));
            }
        }
        memo[idx] = maxLIS;
        return maxLIS;
    }



}
