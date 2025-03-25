class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> viewedNumbers = new HashSet<>();
     for(int num : nums){
        if(viewedNumbers.contains(num)){
            return true;
        }
        viewedNumbers.add(num);
     }  
     return false;
    }
}