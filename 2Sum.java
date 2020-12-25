class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapValPos = new HashMap<Integer,Integer>();
        int remTarget;
        for(int i=0; i< nums.length;i++) {
            remTarget = target-nums[i];
            if(mapValPos.containsKey(remTarget)) {
                return new int[]{i, mapValPos.get(remTarget)};
            }
            else {
                mapValPos.put(nums[i], i);
            }
        }
         throw new IllegalArgumentException("No valid solution for the combination");
    }
}
