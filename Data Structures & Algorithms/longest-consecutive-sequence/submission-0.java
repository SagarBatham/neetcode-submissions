class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,false);
        }

        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],true);
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(map.get(nums[i])==false){
                int k=nums[i];
                while(map.containsKey(k+1)){
                    count++;
                    k++;
                }
            }
            ans=Math.max(count,ans);
        }

        return ans;
    }
}
