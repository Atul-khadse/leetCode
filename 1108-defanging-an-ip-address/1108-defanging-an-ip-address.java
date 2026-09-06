class Solution {
    public String defangIPaddr(String address) {

        StringBuilder newStr = new  StringBuilder();

        int i=0, n=address.length();

        while(i<n){
            if(address.charAt(i) == '.'){
                newStr.append('[');
                newStr.append('.');
                newStr.append(']');
            }else{
                newStr.append(address.charAt(i));
            }
            i++;
        }

        return newStr.toString();
        
    }
}