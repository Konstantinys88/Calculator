import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public static Object[][] positiveDataProvider() {
        String[][] data = new String[4][4];

        data[0][0] = "200.0";
        data[1][0] = "0.0";
        data[2][0] = "10000.0";
        data[3][0] = "10.0";

        data[0][1] = "+";
        data[1][1] = "-";
        data[2][1] = "*";
        data[3][1] = "/";

        data[0][2] = "100";
        data[1][2] = "100";
        data[2][2] = "100";
        data[3][2] = "100";

        data[0][3] = "100";
        data[1][3] = "100";
        data[2][3] = "100";
        data[3][3] = "10";

        return data;
    }

    @Test(dataProvider = "positiveDataProvider")
    public void positiveTest(String result, String[] arr) {
        Assert.assertEquals(result, Calculator.execute(arr));
    }
}


