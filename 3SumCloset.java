class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int min = Integer.MAX_VALUE; // used to store the close values to the target
        int result = 0; // result of the closest sum. 
        Arrays.sort(nums); // sort array before using 3 pointer approach. 
        
        // use 3 pointers i, j, k 
        
        for (int i = 0; i < n-2; i++) {
            int j = i+1, k = n-1;
            
            while (j < k) { 
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == target){ // condition for sum of values equal to target. 
                    result = sum;
                    break;
                };
                
                int diff = Math.abs(sum - target);
                if (diff < min) {
                    result = sum;
                    min = diff;
                }
                
                if (sum > target) {  
                    k--;  // reduce higher pointer if sum greater than target. 
                } else {
                    j++; // increment lower pointer if sum lesser than target. 
                }
            }
        }
        
        return result;
    }
}
