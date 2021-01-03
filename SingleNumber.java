136 LC -- https://leetcode.com/problems/single-number/submissions/


//Solution using HashMap
class Solution {
    public int singleNumber(int[] nums) {

       Map<Integer,Integer> numToCount = new HashMap<Integer,Integer>();
        
        for(int i =0;i< nums.length; i++)
        {
           if(numToCount.containsKey(nums[i])) {
               numToCount.put(nums[i],numToCount.get(nums[i])+1);
           }
            else {
                numToCount.put(nums[i], 1);
            }
        }
        
        for(Map.Entry mapElement : numToCount.entrySet() ) { // using entrySet
            if((int)mapElement.getValue() != 2) {
                return (int)mapElement.getKey();
            } 
        }
        throw new IllegalArgumentException("No result found.");

    }
}
