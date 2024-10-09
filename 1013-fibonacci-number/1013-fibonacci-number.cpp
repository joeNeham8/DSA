class Solution {
public:
    int fib(int n) {
        int sum;
      if(n <= 1){
        return n;
      }
      else{
      return fib(n-1) + fib(n-2);
    }
    }
};
