class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];
        
        for(int i=1;i<strs.length;i++){
           String s=prefix;
        String t=strs[i];
         StringBuilder sb=new StringBuilder("");
        int temp1=0;
        int temp2=0;
        while(temp1<s.length() && temp2<t.length()){
            if(s.charAt(temp1)==t.charAt(temp2)){
                sb.append(s.charAt(temp1));
            }else{
                break;
            }
            temp1++;
            temp2++;
        }
        prefix= sb.toString();
        }

        return prefix;
    }
}