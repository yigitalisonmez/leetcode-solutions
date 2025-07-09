///iven a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
///You can use each character in text at most once. Return the maximum number of instances that can be formed.
/// EASY
/// Categorized as Hashmap question but it's not a hash map question. If the word would be a variable we could have used hashmap.
/// But in this situtation using hashmap only creates confusion.
/// Time:O(n) Space:O(1)
/// ACCEPTED
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;

        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);
            switch (c) {
                case 'b':
                    b++;
                    break;                   
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;                                        
                default:
                    break;
            }

        }
            l/=2;
            o/=2;
            int min=b;
            min=Math.min(min, a);
            min=Math.min(min, l);
            min=Math.min(min, o);
            min=Math.min(min, n);
            return min;
    }
}