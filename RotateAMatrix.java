/* Rotate a matrix by 90 degree in clockwise direction without using any extra space 
Input:
1 2 3 
4 5 6
7 8 9  
Output:
7 4 1 
8 5 2
9 6 3
*/

/* Idea is to take the transpose of the matrix and then multiply it with [[0 0 1][0 1 0][0 0 1]] */

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
  
    public static void transposeMatrix(int[][] matrix) {
    int n = matrix.length;

    // Transpose the matrix
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            // Swap matrix[i][j] and matrix[j][i]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

public static void rotateMatrixClockwise(int[][] matrix) {
    int n = matrix.length;

    // Transpose the matrix
    transposeMatrix(matrix);

    // Reverse the order of columns
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            // Swap matrix[i][j] and matrix[i][n - j - 1]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = temp;
        }
    }
}

static void printMatrix(int arr[][]) {
    int numRows = arr.length;
    int numCols = arr[0].length;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
         int arr[][] = { { 1, 2, 3 },
                      { 4, 5, 6},
                      { 7, 8, 9}};
    rotateMatrixClockwise(arr);
    printMatrix(arr);
    }
}
