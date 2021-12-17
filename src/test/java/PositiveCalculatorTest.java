
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public static Object[][] positiveDataProvider() {
        String[][] data = new String[4][4];

        data[0][0] = "8";
        data[1][0] = "0";
        data[2][0] = "16";
        data[3][0] = "1";

        data[0][1] = "+";
        data[1][1] = "-";
        data[2][1] = "*";
        data[3][1] = "/";

        data[0][2] = "4";
        data[1][2] = "4";
        data[2][2] = "4";
        data[3][2] = "4";

        data[0][3] = "4";
        data[1][3] = "4";
        data[2][3] = "4";
        data[3][3] = "4";

        return data;
    }

    @Test(dataProvider = "positiveDataProvider")
    public void positiveTest(String result, String[] arr) {
        Assert.assertEquals(result, Calculator.execute(arr));
    }
}


