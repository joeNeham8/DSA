class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for(char j : jewels.toCharArray()){
            jewelSet.add(j);
        }  
        int count = 0;

        for(char s : stones.toCharArray()){
            if(jewelSet.contains(s)){
                count++;
            }
        }
        return count;
    }
}