class CustomStack {
    private int arr[];
    private int top;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        this.top=-1;
        this.arr=new int[maxSize];

        
    }
    
    public void push(int x) {
        if(top<maxSize-1){
            arr[++top]=x;
        }
        
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        else{
            return arr[top--];
           // top=top-1;
        }
        
    }
    
    public void increment(int k, int val) {
        int index=Math.min(k,maxSize);
        for(int i=0;i<index;i++){
            arr[i]=arr[i]+val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */