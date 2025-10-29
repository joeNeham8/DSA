class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurrence = new int[26];
        for(int i=0;i<s.length();i++){
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int partitionEnd = 0;
        int partitionStart = 0;

        for(int i=0;i< s.length();i++){
            partitionEnd = Math.max(partitionEnd, lastOccurrence[s.charAt(i)-'a']);

            if(i == partitionEnd){
                result.add(partitionEnd - partitionStart+1);
                partitionStart = i+1;
            }
        }
        return result;
    }
}