package br.com.mesquitagomes.leetcodejava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseballGameTest {

    private BaseballGame baseballGame;

    @BeforeTest
    public void beforeTest() {
        baseballGame = new BaseballGame();
    }

    @DataProvider(name = "operations")
    public Object[][] getOperations() {

        Object[][] operationsData = {
                { new String[] { "5", "2", "C", "D", "+" }, 30 },
                { new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }, 27 },
                { new String[] { "1", "C" }, 0 }
        };

        return operationsData;
    }

    @Test(dataProvider = "operations")
    public void testOperations(String[] operations, Integer expected) {
        Assert.assertEquals(baseballGame.calPoints(operations), expected);
    }

}
