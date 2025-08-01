package org.example.array.hashing;

public class SudokuValidation {
    public static void main(String [] args){
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

//        System.out.println(" value "+board[0]);
       // for(char c : board[1])
            System.out.println("value "+board[0][4]);
        System.out.println("result is "+ isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  // instead of array can use set
            int[] columnCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            char[] row = board[i];
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {           // iterating row
                if (row[j] != '.') {
                    int numericValue = board[i][j] - '0';
                    // System.out.println("numberic value "+numericValue);
                    int counter = count[numericValue];
                    count[numericValue] = ++counter;
                }
            }
            for (int c = 0; c < 9; c++) {   // fetch column 0,1,2, ...
                column[c] = board[c][i];
            }

            for (char x : column) {
                if (x != '.') {
                    int numericValue = x - '0';
                    int counter = columnCount[numericValue];
                    columnCount[numericValue] = ++counter;
                }
            }

            for (int k : count) {
                //  System.out.print(k+" ");
                if (k > 1)
                    return false;
            }

            for (int k : columnCount) {
                //  System.out.print(k+" ");
                if (k > 1)
                    return false;
            }
        }

        int a = 0;
        int b = 0;
        int b_counter = 0;
        int a_counter = 0;
        int total_counter = 0;
        int[] rowColumn = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (total_counter<9) {
            while (a < 9) {
                a_counter=0;
                while (a_counter < 3) {
                    b = total_counter;
                    b_counter =0;
                    while (b_counter < 3) {
                        if(board[b][a] !='.') {
                            int numericValue = board[b][a] - '0';
                            int counter = rowColumn[numericValue];
                            rowColumn[numericValue] = ++counter;
                        }
                        b++;
                        b_counter++;
                    }
                    a++;
                    a_counter++;
                }
                for (int k : rowColumn) {
                    //  System.out.print(k+" ");
                    if (k > 1)
                        return false;
                }
                rowColumn = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            }
            a = 0;
            total_counter = total_counter+3;
        }
        return true;
    }

}
