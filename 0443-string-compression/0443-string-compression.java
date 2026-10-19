class Solution {
    public int compress(char[] chars) {
        int i = 0, count = 1;
        StringBuilder result = new StringBuilder();

        while (i < chars.length) {
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            result.append(chars[i]);
            if (count > 1) {
                result.append(Integer.toString(count));
            }
            i++;
            count = 1;
        }

        for (int j = 0; j < result.length(); j++) {
            chars[j] = result.charAt(j);
        }

        return result.length();
    }
}