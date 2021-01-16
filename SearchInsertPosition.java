35. Search Insert Position -- https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int res =0;
        for(int i =0; i< nums.length; i++) {
            if(nums[i] == target ) {
                res= i;
                break;
            }
            else if(nums[i] > target){
                res= i;
                break;
            }
            else {
                res= nums.length;
            }
        }
        return res;
    }
}
