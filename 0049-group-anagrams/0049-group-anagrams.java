import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // key = sorted string, value = us key wale saare original strings
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();  // word ko char array banao
            Arrays.sort(chars);                 // chars ko sort karo
            String key = new String(chars);     // sorted chars se wapas string: "eat" → "aet"

            // agar ye key map mein pehli baar aayi hai, to naya empty list bana do
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // is key ke list mein original word daal do
            map.get(key).add(word);
        }

        // map ke saare lists (groups) ko return karo
        return new ArrayList<>(map.values());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna