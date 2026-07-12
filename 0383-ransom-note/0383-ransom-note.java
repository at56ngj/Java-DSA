class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)){
                int oldCount=map.get(c);
                map.put(c,oldCount+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char a:ransomNote.toCharArray()) {
            if(map.containsKey(a) && map.get(a)>0){
                int oldCount=map.get(a);
                map.put(a,oldCount-1);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}