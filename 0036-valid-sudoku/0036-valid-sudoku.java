class Solution {
    public boolean isValidSudoku(char[][] board) {
   int N=9;

   HashSet<Character>[] rows = new HashSet[N];
   HashSet<Character>[] col = new HashSet[N];
   HashSet<Character>[] boxes = new HashSet[N];

   for(int r=0;r <N;r++){
    rows[r] = new HashSet<Character>();
    col[r] = new HashSet<Character>();
    boxes[r]= new HashSet<Character>();
   }

   for(int r=0;r<N;r++){
    for(int c=0;c<N;c++){
        char val =board[r][c];
        if (val == '.'){
            continue;
        }
        if(rows[r].contains(val)){
            return false;
        }
        rows[r].add(val);

        if(col[c].contains(val)){
            return false;
        }
        col[c].add(val);

        int index = (r/3) *3 +c/3;
        if(boxes[index].contains(val)){
            return false;
        }
        boxes[index].add(val);
    }
   }
   return true;


    }
}