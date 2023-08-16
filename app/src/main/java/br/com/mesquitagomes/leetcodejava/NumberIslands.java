package br.com.mesquitagomes.leetcodejava;

/**
 * Number of Islands
 * 
 * Given a 2D grid map of '1's (land) and 'O's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example l:
 *  Input:
 *      11110
 *      ll010
 *      11000
 *      00000
 *  Output: 1
 * 
 * Example 2:
 *  Input:
 *      11000
 *      11000
 *      00100
 *      000ll
 *  Output: 3
 */
public class NumberIslands {

    public int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    depthFirstSearch(grid, i, j);
                }
            }
        }

        return count;
    }

    private void depthFirstSearch(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        depthFirstSearch(grid, i + 1, j); // down
        depthFirstSearch(grid, i - 1, j); // up
        depthFirstSearch(grid, i, j - 1); // left
        depthFirstSearch(grid, i, j + 1); // right
    }

}