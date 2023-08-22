package br.com.mesquitagomes.leetcodejava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReorderAnArrayTest {

    private ReorderAnArray reorderAnArray;

    @BeforeTest
    public void beforeTest() {
        reorderAnArray = new ReorderAnArray();
    }

    @DataProvider(name = "arrays")
    public Object[][] getOperations() {

        Object[][] operationsData = {
                { new int[] { 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2 }, new int[] { 1, 2, 4, 3 } },
                { new int[] { 1, 2, 3, 4, 5 }, new int[] { 0, 1, 1, 2, 4 }, new int[] { 1, 3, 4, 2, 5 } }
        };

        return operationsData;
    }

    @Test(dataProvider = "arrays")
    public void testArrays(int[] x, int[] y, int[] expected) {
        Assert.assertEquals(reorderAnArray.solution(x, y), expected);
    }

}
