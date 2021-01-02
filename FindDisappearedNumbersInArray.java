Leetcode 448 - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

// 2 pass approach without additional counters
// the constaints in the question help us simplify the problem. 



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i< nums.length;i++) {
            int temp = Math.abs(nums[i]);
            
            if(nums[temp-1] >0) {
                nums[temp-1] = -nums[temp-1];
            }
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j] >0){ 
                result.add(j+1);
            }
        }
        
        return result;
    }
}
