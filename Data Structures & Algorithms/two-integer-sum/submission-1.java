class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
             if(hmap.containsKey(rem)) {
                return new int[]{hmap.get(rem), i};
            }

            hmap.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
