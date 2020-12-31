//Brute Force Solution for -- https://leetcode.com/problems/largest-rectangle-in-histogram/
 
//For each bar check the left and right limits which can include and store the max area. 
// Time Complexity O(N*N) 
 
class Solution {
    public int largestRectangleArea(int[] heights) {
        int numOfRect = heights.length;
        
        int maxArea = 0;
        
        for(int i =0; i<numOfRect; i++) {
            maxArea = Math.max(getMaxAreaAtPostion(heights, i), maxArea);
        }
        
        return maxArea;
        
    }
    
    public int getMaxAreaAtPostion(int[] heights, int pos) {
        
        int left =pos;
        int right = pos;
        
        while(left>0 && heights[pos] <= heights[left-1]) {
            left--;
        }
        
        while(right < heights.length-1 && heights[pos] <= heights[right+1]) {
            right++;
        }
        
        return (right - left +1) * heights[pos];
        
    }
}
