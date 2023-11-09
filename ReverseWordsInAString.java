class Solution {
    public String reverseWords(String s) {
        s.trim();
        System.out.println(s);
        String[] words = s.split("\\s+");
        System.out.println(words.length);
        int start = 0;
        int end = words.length - 1;
        String temp = "";
        while(start < end){
            temp = words[end];
            words[end] = words[start];
            words[start] = temp;
            start++;
            end--;
        }
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < words.length;i++){
            res.append(words[i]);
            res.append(" ");
        }

        

        return res.toString().trim();
    }
}
