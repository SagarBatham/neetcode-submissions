class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int e:nums){
            hs.add(e);
        }
        int ans=1;
        while(true){

            if(hs.contains(ans)){
                ans++;
            }else{
                break;
            }
        }

        return ans;
    }
}