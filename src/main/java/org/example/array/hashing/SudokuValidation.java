package org.example.array.hashing;

public class SudokuValidation {
    public static void main(String [] args){
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

//        System.out.println(" value "+board[0]);
//        System.out.println(" value 2  "+board[1][2]);
        System.out.println("result is "+ isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int [] count = {0,0,0,0,0,0,0,0,0,0};
            int [] columnCount = {0,0,0,0,0,0,0,0,0,0};
            char [] row = board[i];
            char [] column = new char[9];
            for(int j=0;j<9;j++){           // iterating row
                if(row[j] != '.') {
                    int numericValue = board[i][j] - '0';
                   // System.out.println("numberic value "+numericValue);
                   int counter = count[numericValue];
                    count[numericValue] = ++counter;
                }
            }
            for(int c =0;c<9;c++){   // fetch column 0,1,2, ...
               column[c] =  board[c][i];
            }
//            System.out.println("printing column "+i);
//            for(char k : column){
//                System.out.print(k+" ");
//            }

            for(char x : column){
                if(x!='.'){
                    int numericValue = x - '0';
                    int counter = columnCount[numericValue];
                    columnCount[numericValue] = ++counter;
                }
            }

            for(int k : count){
              //  System.out.print(k+" ");
                if(k>1)
                    return false;
            }

            for(int k : columnCount){
              //  System.out.print(k+" ");
                if(k>1)
                    return false;
            }
        }
        return true;
    }

}
