package br.com.mesquitagomes.leetcodejava;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinWindowSubstringTest {

    private MinWindowSubstring minWindowSubstring;

    @BeforeTest
    public void beforeTest() {
        minWindowSubstring = new MinWindowSubstring();
    }

    @DataProvider(name = "sources-targets")
    public String[][] getOperations() {

        String[][] operationsData = {
                { "ahffaksfajeeubsne", "jefaa", "aksfaje" },
                { "aaffhkksemckelloe", "fhea", "affhkkse" },
                { "aaabaaddae", "aed", "dae" },
                { "aabdccdbcacd", "aad", "aabd" },
                { "a", "a", "a" },
                { "a", "aa", "" }
        };

        return operationsData;
    }

    @Test(dataProvider = "sources-targets")
    public void testArrays(String s, String t, String expected) {
        Assert.assertEquals(minWindowSubstring.solution(s, t), expected);
    }

}
