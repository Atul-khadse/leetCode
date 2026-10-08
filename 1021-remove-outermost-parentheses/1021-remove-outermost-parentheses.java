class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder st = new StringBuilder();
        int level = 0;


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                if(level > 0){
                    st.append(c);
                }
                level++;
            }else{
                level--;
                if(level > 0){
                    st.append(c);
                }
            }
        }




        return st.toString();
        
    }
}