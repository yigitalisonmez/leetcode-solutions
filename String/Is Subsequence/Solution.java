class Solution {
    public boolean isSubsequence(String s, String t) {
        int  ctr=0;
        if(s.isEmpty())
            return true;
        for (int i = 0; i < t.length(); i++) {
            if(ctr==s.length())
                return true;
            if(t.charAt(i)==s.charAt(ctr)){
                ctr++;
            }

        }
        return ctr>=s.length();// UNIMPLEMENTED 
    }
}