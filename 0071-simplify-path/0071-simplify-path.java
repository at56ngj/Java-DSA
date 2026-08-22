class Solution {
    public String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack <String> stack=new Stack<>();
        for(String ch:str){
            if(ch.equals("")|| ch.equals(".")){
                continue;
            }else if(ch.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }else{
                    stack.push(ch);
                }
        }
        StringBuilder st=new StringBuilder();
        for(String c:stack){
            st.append("/").append(c);

        }
        if(st.length()==0){
            return "/";
        }
        else{
            return st.toString();
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna