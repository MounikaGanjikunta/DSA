class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
         HashSet<String> set = new HashSet<>();
        String[] res = s.split(" ");
        if(pattern.length() != res.length){
            return false;
        }

        for(int i = 0; i < res.length; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(res[i])){
                    // System.out.println(map.get(pattern.charAt(i)));
                    // System.out.println(res[i]);
                    return false;
                }
            }else{
                // System.out.println(pattern.charAt(i));
                // System.out.println(res[i]);
                map.put(pattern.charAt(i),res[i]);
                set.add(res[i]);
            }
        }

        if(map.size() == set.size()){
            return true;
        }else{
            return false;
        }

       //return true;
    }
}
