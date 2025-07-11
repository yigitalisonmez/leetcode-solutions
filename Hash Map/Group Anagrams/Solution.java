///Given an array of strings strs, group the anagrams together. You can return the answer in any order.
/// MEDIUM
/// Time:O(n^2logn) Space:(n)
/// In first glance,it is hard to tell that we should sort the words.
/// When words sorted inside themselves,anagram words will be transformed into same char sequences.
/// In that way we can have a hashmap that maps the anagrams to the same places.
/// ACCEPTED.
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrings = new String[strs.length];
        
        
        for (int i = 0; i < strs.length; i++) {
            sortedStrings[i] = sortString(strs[i]);
        }
        
        
        HashMap<String, LinkedList<String>> dict = new HashMap<>();
        
        for (int i = 0; i < sortedStrings.length; i++) {
            if (!dict.containsKey(sortedStrings[i])) {
                LinkedList<String> anagramList = new LinkedList<>();
                anagramList.add(strs[i]);
                dict.put(sortedStrings[i], anagramList);
            } else {
                LinkedList<String> anagramList = dict.get(sortedStrings[i]);
                anagramList.add(strs[i]);
                
            }
        }
        
        
        List<List<String>> groupAnagrams = new ArrayList<>();
        for (LinkedList<String> anagramList : dict.values()) {
            groupAnagrams.add(anagramList);
        }
        
        return groupAnagrams;
    }
    
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}