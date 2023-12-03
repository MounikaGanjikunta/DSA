class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for(int j = 0; j < ransomNote.length(); j++){
            if(map.containsKey(ransomNote.charAt(j))){
               int countval =  map.get(ransomNote.charAt(j));
               map.put(ransomNote.charAt(j), countval - 1);
               if(map.get(ransomNote.charAt(j)) == 0){
                   map.remove(ransomNote.charAt(j));
               }
            }else{
                return false;
            }
        }

        return true;
    }
}
