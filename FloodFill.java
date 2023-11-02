// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class HelloWorld {
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int row, int col, String asf, boolean[][] vis) {
        
        if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 1 || vis[row][col] == true){
            return;
        }else if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(asf);
            return;
        }
        
        vis[row][col] = true;
        floodfill(maze, row - 1, col, asf + 't',vis);
        floodfill(maze, row, col - 1, asf + 'l',vis);
        floodfill(maze, row + 1, col, asf + 'd',vis);
        floodfill(maze, row, col + 1, asf + 'r',vis);
        vis[row][col] = false;
    
    }


    public static void main(String[] args) {
        
        int n = 3;
        int m = 3;
        int[] a = {0,0,0,1,0,1,0,0,0};
        int k = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = a[k];
                k++;
            }
        }
        boolean[][] vis = new boolean[n][m];
        floodfill(arr, 0, 0, "",vis);
    }

}
