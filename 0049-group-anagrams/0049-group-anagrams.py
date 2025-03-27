class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_dict = defaultdict(list)

        for s in strs:
            key = tuple(sorted(s))  
            anagrams_dict[key].append(s)
        
        return list(anagrams_dict.values())