
public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;

        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(s);
        visited.add(s);

        boolean foundValid = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
   
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

         
                if (isValid(curr)) {
                    result.add(curr);
                    foundValid = true; 
                }

                
                if (foundValid) continue;

              
                for (int j = 0; j < curr.length(); j++) {
                    
                    if (curr.charAt(j) != '(' && curr.charAt(j) != ')') continue;

                   
                    String next = curr.substring(0, j) + curr.substring(j + 1);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.add(next);
                    }
                }
            }

            if (foundValid) break;
        }

        return result;
    }

    private boolean isValid(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') count++;
            if (c == ')') {
                count--;
                if (count < 0) return false; 
            }
        }
        return count == 0;
    }
}