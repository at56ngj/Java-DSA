import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList <Integer> arr=new ArrayList<>();

        for(int i=1;i<=9;i++){
            int num=i;
            int nextDigit=i;
            while(nextDigit<9){
                nextDigit+=1;
                num=num*10+nextDigit;
            
            if(num>=low && num<=high){
                arr.add(num);
            }

            }
        }
        Collections.sort(arr);
        return arr;
        
    }
}