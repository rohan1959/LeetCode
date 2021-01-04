// LC 1668 -- https://leetcode.com/problems/maximum-repeating-substring/submissions/ 

class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int res =0;
        String temp = word;
        
        for(int i=0; i<sequence.length();i++ ) {
            if(sequence.contains(temp)) {
                res++;
            }
            temp = temp.concat(word);
        }
        return res;
    }
}
