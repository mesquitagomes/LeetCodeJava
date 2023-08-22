package br.com.mesquitagomes.leetcodejava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UniqueBinaryBoxTest {

    private UniqueBinaryBox uniqueBinaryBox;

    @BeforeTest
    public void beforeTest() {
        uniqueBinaryBox = new UniqueBinaryBox();
    }

    @DataProvider(name = "boxes")
    public Object[][] getOperations() {

        Object[][] operationsData = {
                { 3, new int[] { 0, 1, 1, 2 } },
                { 5, new int[] { 0, 1, 1, 2, 1, 2 } }
        };

        return operationsData;
    }

    @Test(dataProvider = "boxes")
    public void testBoxes(int n, int[] expected) {
        Assert.assertEquals(uniqueBinaryBox.solution(n), expected);
    }

}
