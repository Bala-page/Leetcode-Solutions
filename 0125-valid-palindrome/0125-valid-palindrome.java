class Solution {
    public boolean isPalindrome(String s) {
        char []ch=s.trim().toLowerCase().toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(ch[j])){
                j--;
            }
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}