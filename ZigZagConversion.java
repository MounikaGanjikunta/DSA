class Solution {
    public String convert(String s, int numRows) {
        ArrayList<StringBuilder> List = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List.add(new StringBuilder());
        }
        
        int len = s.length();
    
        int k = 0;
        //System.out.println(List.size());
        while(k < len){
            for(int i = 0; i < List.size() && k < len;i++,k++){
                
                List.get(i).append(s.charAt(k));
             
                
            }
            for(int i = List.size() - 2; i >= 1 && k < len;i--,k++){
                
                List.get(i).append(s.charAt(k));
        
                
            }
          
        }
    //System.out.println(List.get(0));
     
    StringBuilder res = new StringBuilder();
    for(int i = 0; i < List.size(); i++){
        res.append(List.get(i));
    }
    // System.out.println(res);  


     return res.toString();
    }
}
