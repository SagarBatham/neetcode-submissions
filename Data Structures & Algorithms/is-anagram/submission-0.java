class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> hss=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hss.containsKey(ch)){
                hss.put(ch,hss.get(ch)+1);
            }else{
                hss.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!hss.containsKey(ch)){
                return false;
            }
            if(hss.containsKey(ch)){
                hss.put(ch,hss.get(ch)-1);
            }else{
                hss.remove(ch);
            }

            if(hss.get(ch)==0){
                hss.remove(ch);
            }
        }

        if(hss.isEmpty()){
            return true;
        }


        return false;
    }
}