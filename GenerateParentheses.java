class Solution {

    public void generateParenthesis(List<String> result, String current_string, int open, int close, int max){
        if(current_string.length() == max * 2){
            result.add(current_string);
            return;
        }

        if(open < max){
            generateParenthesis(result,current_string + "(", open + 1, close, max);
        }
        if(close < open){
            generateParenthesis(result,current_string + ")", open, close + 1, max);
        }
    }


    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result,"", 0, 0, n);
        return result;
    }
}
