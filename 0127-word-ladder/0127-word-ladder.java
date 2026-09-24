class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);

        if (!dict.contains(endWord)) {
            return 0;
        }

         Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1; 

         while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currWord = queue.poll();

                if (currWord.equals(endWord)) {
                    return level;
                }


                char[] wordChars = currWord.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];


                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                    wordChars[j] = c;
                        String nextWord = String.valueOf(wordChars);

                        if (dict.contains(nextWord)) {
                            queue.add(nextWord);
                            dict.remove(nextWord); 
                        }

                    }

                    wordChars[j] = originalChar;
                }
               
            
            
            }

             level++;

         }
        return 0;
    }
}