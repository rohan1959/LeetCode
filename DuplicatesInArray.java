442 - LeetCode - https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i =0; i < nums.length;i++) {
            int temp = Math.abs(nums[i]);
            
            if(nums[temp-1] <0) {
                result.add(temp);
            }
            else {
                nums[temp-1] = - nums[temp-1];
            }
        }
        return result;
        
    }
}
