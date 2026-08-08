class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=nums.length;
        l=l/3;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele:nums){
            if(ans.contains(ele)){
                continue;
            }
            if(map.get(ele)>l){
                ans.add(ele);
            }
        }
        return ans;
    }
}