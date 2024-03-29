class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }

        if(map.size() == set.size()){
            return true;
        }else{
            return false;
        }
        
    }
}
