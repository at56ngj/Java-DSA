class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> list=new ArrayList<>();
        char[] parr=p.toCharArray();
        Arrays.sort(parr);
        String psorted=new String(parr);
        int n=p.length();
        for(int i=0;i<=s.length()-n;i++){
            String sub=s.substring(i,i+n);
            char[] sarr=sub.toCharArray();
            Arrays.sort(sarr);
            String ssorted=new String(sarr);

            if(psorted.equals(ssorted)){
                list.add(i);
            }

        }
        return list;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna