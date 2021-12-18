import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public static Object[][] negativeDataProvider() {
        Object[][] data = {new Object[]{"5.0", "+", "2", "2"},
                new Object[]{"200", "-", "-99.999", "99.99"},
                new Object[]{"", "*", "0", "0"},
                new Object[]{"", "/", "13", "0"}};
        return data;
    }

    @Test(dataProvider = "negativeDataProvider")
    public void negativeTest(String result, String[] arr) {
        Assert.assertNotEquals(result, Calculator.execute(arr));


    }


}
