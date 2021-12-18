import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "3", "2", "5.0"},
                {"-", "100", "-1", "101.0"},
                {"*", "4", "4", "16.0"},
                {"/", "10", "2", "5.0"}};
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String operation, String valueOne, String valueTwo, String result) {
        String actual = Calculator.execute(new String[]{operation, valueOne, valueTwo, result});
        Assert.assertEquals(actual, result);
    }

}


