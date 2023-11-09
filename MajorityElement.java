import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums.length/2;

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }

       for (int key : map.keySet()) {
           if(map.get(key) > majority){
               return key;
           }
            // System.out.println(key);
        }
        // for(int j = 0; j < map.size(); j++){
        //     System.out.println(map.get(nums[j]));
        //     if(map.get(nums[j]) > majority){
        //         return nums[j];
        //     }
        // }
        

//         Set keys = map.keySet();
//         Iterator i = keys.iterator();
//         while (i.hasNext() ) {
//         System.out.println(i.next());
// }

// Collection getValues = map.values();
// i = getValues.iterator();
// while (i.hasNext()) {
//    System.out.println(i.next());
// }
    return 0;
       
    }
}
