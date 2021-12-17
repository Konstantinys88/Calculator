import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public static Object[][] positiveDataProvider() {
        String[][] data = new String[4][4];

        data[0][0] = "5.0";
        data[1][0] = "2.4";
        data[2][0] = "9.6";
        data[3][0] = "0.6666666666666666";

        data[0][1] = "+";
        data[1][1] = "-";
        data[2][1] = "*";
        data[3][1] = "/";

        data[0][2] = "2";
        data[1][2] = "-0.0";
        data[2][2] = "2";
        data[3][2] = "2";

        data[0][3] = "3";
        data[1][3] = "-2.4";
        data[2][3] = "4.8";
        data[3][3] = "3";

        return data;
    }

    @Test(dataProvider = "positiveDataProvider")
    public void positiveTest(String result, String[] arr) {
        Assert.assertEquals(result, Calculator.execute(arr));
    }
}


