class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
       
       StringBuilder result = new StringBuilder(); 
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                if(counter>0){
                     result.append(a);
                }
                counter++;
              
            }
            else if(a==')'){
               
                counter--;
                if(counter>0){
                    result.append(a);
                }
            }
           
        }
       return result.toString();

        
        
    }
}