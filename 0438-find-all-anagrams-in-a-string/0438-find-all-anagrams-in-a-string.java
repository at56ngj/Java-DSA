import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> list=new ArrayList<>();
       int n=p.length();
       char parr[]=p.toCharArray();
       Arrays.sort(parr);
       String psorted=new String(parr);
       for(int i=0;i<=s.length()-n;i++){
        String sub=s.substring(i,i+n);
        char subarr[]=sub.toCharArray();
        Arrays.sort(subarr);
        String subsorted=new String(subarr);
        if(subsorted.equals(psorted)){
            list.add(i);
        }
       }
       return list;

    }
} 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna