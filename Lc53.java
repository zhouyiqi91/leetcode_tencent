/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
*/

public class Lc53 {
    //贪心
    public int maxSubArray(int[] nums) {
        int maxSum =  Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num:nums){
            currentSum += num;
            if (currentSum > maxSum) maxSum = currentSum;
            if (currentSum<0) currentSum = 0;
        }
        return maxSum;
    }

    //DP
    //DP数组 DP[i] 以第i位结尾的子序列的最大值
    public int maxSubArray_dp(int[] nums) {
        int maxSum =  nums[0];
        int[] DP = new int[nums.length];
        DP[0] = nums[0];
        
        for (int i=1;i<nums.length;i++){
            DP[i] = Math.max(DP[i-1]+nums[i],nums[i]);
            if (DP[i]>maxSum) maxSum = DP[i];
            System.out.println(DP[i]);
        }
        return maxSum;
    }

    
}