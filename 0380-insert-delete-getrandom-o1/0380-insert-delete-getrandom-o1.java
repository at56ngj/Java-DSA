class RandomizedSet {
    HashMap <Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();
    Random rand = new Random();


    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val)){
        return false;
       }
       else{
        list.add(val);
        map.put(val,list.size()-1);
        return true;
       }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index=map.get(val);
            int lastelement=list.get(list.size()-1);
            list.set(index,lastelement);
            map.put(lastelement,index);

            list.remove(list.size()-1);
            map.remove(val);

            return true;
        }
        else{
            return false;
        }
        
    }
    
    public int getRandom() {
        int randomeIndex=rand.nextInt(list.size());
        return list.get(randomeIndex);


        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */