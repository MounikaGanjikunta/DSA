class RandomizedSet {
    ArrayList<Integer> arr;
    HashMap<Integer,Integer> map;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        arr = new ArrayList<Integer>();
        map = new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,arr.size());
        arr.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int idx = map.get(val);
        if(idx < arr.size() - 1){
            int temp = arr.get(arr.size() - 1);
          //  arr.set(arr.size() - 1, arr.get(idx));
            arr.set(idx, temp);
            map.put(temp, idx);
        }
        map.remove(val);
        arr.remove(arr.size() - 1);
        return true;


        
    }
    
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
