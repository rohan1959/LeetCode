// Maximum Subarray leetcode: https://leetcode.com/problems/maximum-subarray/

// Brute Force Solution : O(n2) -> Compute the sum of all sub arrays.  

class Solution {
    public int maxSubArray(int[] nums) {
        //BruteForce solution:
        int currMax = Integer.MIN_VALUE;
        
        for(int i =0;i< nums.length; i++) {
            int temp =0;
            for(int j =i;j< nums.length;j++ ) {
                temp = temp + nums[j];
                currMax = Math.max(temp, currMax);
            }
        }
        return currMax;
    }
}
