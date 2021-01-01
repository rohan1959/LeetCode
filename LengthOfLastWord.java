Solution for -- https://leetcode.com/problems/length-of-last-word/

// Using Split operator. 
class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] subWords = s.split(" ");
        int len = subWords.length;
        if(len == 0) {
          return 0;
        }
        else {
          return subWords[len-1].length();
        }
    }
}

