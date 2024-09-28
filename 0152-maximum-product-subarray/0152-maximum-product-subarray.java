
class Solution {
    public int maxProduct(int[] nums) {
            int n = nums.length;
            long sol = nums[0];
            for(int i=0;i<n;i++){
                            long mul = 1;
                for(int j=i;j<n;j++){
                    mul *= nums[j];
                    sol = Math.max(sol,mul);
                }
            }
            return (int) sol;

                
    }
}