class Solution {
    public String decodeMessage(String key, String message) {

        char[] a = new char[26];
        char ch = 'a';
        Arrays.fill(a, '.');

        for(int i=0; i < key.length(); i++){
            if(key.charAt(i) == ' ') continue;
            if(a[key.charAt(i) - 'a'] == '.'){
                a[key.charAt(i) - 'a'] = ch;
                ch++;
            }
        }


        StringBuilder s = new StringBuilder();
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' ') s.append(' ');
            else s.append(a[message.charAt(i) - 'a']);
        }

        return s.toString();
        
    }
}