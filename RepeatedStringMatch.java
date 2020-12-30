//Solution for 686. Repeated String Match - https://leetcode.com/problems/repeated-string-match/

class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        int bLen = b.length();
        int aLen = a.length();
        String dup = a;
        if(a.equals(b)) return 1;
        int maxRep = bLen/aLen +2;
        for(int i =1; i <= maxRep ;i++) {
            if(dup.contains(b)) {
                return i;
            }
            dup = dup.concat(a);
        }
        
        return -1;
        
    }
}
