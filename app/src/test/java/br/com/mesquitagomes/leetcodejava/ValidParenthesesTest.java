package br.com.mesquitagomes.leetcodejava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeTest
    public void beforeTest() {
        validParentheses = new ValidParentheses();
    }

    @DataProvider(name = "parentheses")
    public Object[][] getParentheses() {

        Object[][] operationsData = {
                { "()", true },
                { "()[]{}", true },
                { "(]", false },
                { "([)]", false },
                { "{[]}", true },
                { "((", false },
                { "){", false },
                { "((", false }
        };

        return operationsData;
    }

    @Test(dataProvider = "parentheses")
    public void testParentheses(String s, Boolean expected) {
        Assert.assertEquals(validParentheses.isValid(s), expected);
    }

}
