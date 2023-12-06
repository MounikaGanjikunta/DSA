class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
       int index;
       int val;

    
    while(true){
        val = 0;
       while(n > 0){
           index = n % 10;
           val = val + index * index;
           n = n/10;
       }

       if(val == 1){
           return true;
       }else if(set.contains(val)){
           return false;
       }

       set.add(val);
       n = val;
    }
    }
}
