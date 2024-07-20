class Solution {
    
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = 1;
        
        //traverse through the array and for non-zero cell mark 1st row as 0 and if the 
        //cell is not in first column mark first column as 0 and if cell is first column 
        //mark col0 as 0
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
                
            }
        }
        
        //traverse from 1st row and 1st column and mark cells as zero
        for (int i = 1; i < row; ++i) {
            for (int j = 1; j < col; ++j) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        
        
        //mark the first row as zero
        if (matrix[0][0] == 0) {
            for (int j = 0; j < col; ++j) {
                matrix[0][j] = 0;
            }
        }
        
        //then mark the first col as zero
        if (col0 == 0) {
            for (int i = 0; i < row; ++i) {
                matrix[i][0] = 0;
            }
        }
    }
}