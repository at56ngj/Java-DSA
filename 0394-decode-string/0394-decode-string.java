class Solution {
    public String decodeString(String s) {
        Stack<String> stackstr=new Stack<>();
        Stack<Integer> stacknum=new Stack<>();
        String current="";
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                
            }else if(ch=='['){
                stacknum.push(num);
                stackstr.push(current);
                current="";
                num=0;
            }else if(ch==']'){
                int rep=stacknum.pop();
                String prev=stackstr.pop();
                String temp="";
                for(int j=0;j<rep;j++){
                    temp=temp+current;
                }
                current=prev+temp;
            }
            else{
                current=current+ch;
            }
        }
        return current;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna