class Solution {
    public int calPoints(String[] str) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            String op=str[i];

            if(op.equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(op.equals("D")){
                arr.add(2*arr.get(arr.size()-1));
            }
            else if(op.equals("+")){
                arr.add(arr.get(arr.size()-1)+ arr.get(arr.size()-2));
            }
            else{
                arr.add(Integer.parseInt(op));
            }
        }
        int total=0;
        for(int i: arr){
            total=total+i;
        }
        return total;
        
        
    }
}