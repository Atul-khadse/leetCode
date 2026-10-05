class Solution {
    public int scoreOfParentheses(String s) {
        
         Stack<Integer> stack = new Stack<>();
        int currentScore = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
             
                stack.push(currentScore);
                currentScore = 0; 
            } else {
                currentScore = stack.pop() + Math.max(2 * currentScore, 1);
            }
        }
        
        return currentScore;
    }
}