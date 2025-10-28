class Solution {
    public int jump(int[] nums) {
        int jump=0, currMax=0; 
        int currEnd=0;

        for (int i=0;i<nums.length-1;i++){
            currMax = Math.max(currMax, i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=currMax;
            }
        }
        return jump;
    }
}