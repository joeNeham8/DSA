class Solution {
public:
    vector<vector<int>> result;
    vector<int> current;

    void backtrack(vector<int>& candidates, int target, int start) {
       
        if (target == 0) {
            result.push_back(current);
            return;
        }

     
        for (int i = start; i < candidates.size(); i++) {
            
            if (candidates[i] > target)
                continue;

            current.push_back(candidates[i]);

            backtrack(candidates, target - candidates[i], i);

            current.pop_back();
        }
    }

    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        backtrack(candidates, target, 0);
        return result;
    }
};
