class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           
            if(c=='('){
                count++;
                ans=Math.max(ans,count);
            }
            else if(c==')'){
                count--;
            }


        }
        return ans;
        
    }
}