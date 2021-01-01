// Maximum Subarray leetcode: https://leetcode.com/problems/maximum-subarray/


// Optimized solution with O(n) -> ignore prefix that result in sum < 0 as we are looking for continous sum. 
// 

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0]; // used to store the max sum of the sub array. 
        int temp =0;
        
        for(int i =0;i< nums.length; i++) {
            if(temp < 0)
                temp =0;
            temp = temp + nums[i];
            currSum = Math.max(currSum, temp);
        }
        return currSum;
    }
}



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



