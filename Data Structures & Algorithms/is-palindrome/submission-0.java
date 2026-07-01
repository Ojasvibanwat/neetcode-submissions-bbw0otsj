class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<j) {
            while(i<j && !alphaNumeric(s.charAt(i))){
                i++;
            }
            while(i<j && !alphaNumeric(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean alphaNumeric(char c) {
        return (c<='9' && c>='0' ||
        c<='Z' && c>='A' ||
        c<='z' && c>='a');
    }
}
