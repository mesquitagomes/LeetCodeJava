package br.com.mesquitagomes.leetcodejava;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberIslandsTest {

    NumberIslands numberIslands;

    @BeforeTest
    public void beforeTest() {

        numberIslands = new NumberIslands();
    }

    @Test
    public void gridWith1Island() {

        char[][] grid = { {'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        assertEquals(numberIslands.numIslands(grid), 1);
    }

    @Test
    public void gridWith3Islands() {

        char[][] grid = { {'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        assertEquals(numberIslands.numIslands(grid), 3);
    }

    @Test
    public void gridWith2IslandsSameLine() {

        char[][] grid = { {'1','1','0','1','1'}, {'0','0','0','0','0'}, {'0','0','0','0','0'}, {'0','0','0','0','0'}};
        assertEquals(numberIslands.numIslands(grid), 2);
    }

    @Test
    public void gridWith2IslandsSameColumn() {

        char[][] grid = { {'0','0','1','0','0'}, {'0','0','1','0','0'}, {'0','0','0','0','0'}, {'0','0','1','0','0'}};
        assertEquals(numberIslands.numIslands(grid), 2);
    }

    @Test
    public void gridWith0Island() {

        char[][] grid = { {'0','0','0','0','0'}, {'0','0','0','0','0'}, {'0','0','0','0','0'}, {'0','0','0','0','0'}};
        assertEquals(numberIslands.numIslands(grid), 0);
    }

}
