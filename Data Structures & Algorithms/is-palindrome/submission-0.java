class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else if(ch>='A' && ch<='Z'){
                sb.append(Character.toLowerCase(ch));
            }else if(ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        String str=sb.toString();
        

        return pal(str);
    }

    public boolean pal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
            return false;
           }
            i++;
            j--;
        }

        return true;
    }
}
