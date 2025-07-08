/* Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

class Solution {
    public boolean isPalindrome(String s) {
            
            /// EDGE CASES
        
            int leftIdx=0;
            int rightIdx=s.length()-1;
            char c1='\t';
            char c2='\t';
        
            while(leftIdx<rightIdx){
                while(!(Character.isLetterOrDigit(s.charAt(leftIdx)))){
                    leftIdx++;
                    if(leftIdx==s.length())
                        return true;
                }

                while(!(Character.isLetterOrDigit(s.charAt(rightIdx)))){
                    rightIdx--;
                }
                c1=Character.toLowerCase(s.charAt(leftIdx));
                c2=Character.toLowerCase(s.charAt(rightIdx));
                //ikisi de char
                if(c1!=c2)
                    return false;
                else{
                    leftIdx++;
                    rightIdx--;
                }
            }
            return true; 

    }
}