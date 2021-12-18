import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public static Object[][] positiveDataProvider() {
        Object[][] data = {new Object[]{"4.0", "+", "1", "3"},
                new Object[]{"0.0", "-", "100", "100"},
                new Object[]{"16.0", "*", "4", "4"},
                new Object[]{"4.0", "/", "16", "4"}};
        return data;
    }

    @Test(dataProvider = "positiveDataProvider")
    public void positiveTest(String result, String[] arr) {
        Assert.assertEquals(result, Calculator.execute(arr));
    }
}


