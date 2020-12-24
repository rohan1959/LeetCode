class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> setOfResults = new HashSet<>();
        
        if(nums.length<3) {
            return new ArrayList<>(setOfResults);
        }
        
        Arrays.sort(nums);
        
        for(int i =0; i< nums.length-2;i++) {
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k) {
                int sum = nums[i]+ nums[j] + nums[k] ;
                if(sum== 0) {
                    setOfResults.add(Arrays.asList(nums[i], nums[j++], nums[k--])); // increment j and decrement k at the same time. 
                    
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        
        return new ArrayList<>(setOfResults);
    }
}
