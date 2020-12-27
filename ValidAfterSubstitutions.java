//Check If Word Is Valid After Substitutions - https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
//Solution

class Solution {
    public boolean isValid(String s) {
        String baseString= "abc";
        if(s.trim() == ""){
            return true;
        }
        
        while(s.contains(baseString)) { // check for base string and replace with "" if valid all the base strings can be replaced and will result in a empty string. 
            s = s.replace(baseString, "");
        }
        return s == "";
    }
}
