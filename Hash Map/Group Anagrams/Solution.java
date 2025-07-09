import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrings = new String[strs.length];
        
        // Her string'i sortla
        for (int i = 0; i < strs.length; i++) {
            sortedStrings[i] = sortString(strs[i]);
        }
        
        // HashMap oluştur
        HashMap<String, LinkedList<String>> dict = new HashMap<>();
        
        for (int i = 0; i < sortedStrings.length; i++) {
            if (!dict.containsKey(sortedStrings[i])) {
                LinkedList<String> anagramList = new LinkedList<>();
                anagramList.add(strs[i]);
                dict.put(sortedStrings[i], anagramList);
            } else {
                LinkedList<String> anagramList = dict.get(sortedStrings[i]);
                anagramList.add(strs[i]);
                // dict.put(sortedStrings[i], anagramList); // Bu satır gereksiz
            }
        }
        
        // Sonucu oluştur
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