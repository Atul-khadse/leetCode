class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();

        Stack<Integer> st = new Stack<>();

        st.push(-1);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.empty()) {
                    st.pop();
                }
                if (!st.empty()) {
                    ans = Math.max(ans, i - st.peek());

                }

                else {
                    st.push(i);
                }
            }

        }

        return ans;

    }
}