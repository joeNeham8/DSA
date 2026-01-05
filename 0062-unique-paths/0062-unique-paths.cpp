class Solution {
public:
    int uniquePaths(int m, int n) {
      long long res = 1;
      int N = m+n -2;
      int r = min(m-1, n-1);

      for(int i=1; i<=r; i++){
        res = res * (N - r + i) / i;
      }
      return (int)res;
    }
};