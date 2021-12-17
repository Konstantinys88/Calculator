import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public static Object[][] negativeDataProvider(){

        String[][] data = new String[4][4];

//        data[0][0] = "200";
//        data[1][0] = "100";
//        data[2][0] = "0";
//        data[3][0] = "0";

        data[0][1] = "+";
        data[1][1] = "-";
        data[2][1] = "*";
        data[3][1] = "/";

        data[0][2] = "101";
        data[1][2] = "-1";
        data[2][2] = "101";
        data[3][2] = "101";

        data[0][3] = "-1";
        data[1][3] = "0";
        data[2][3] = "-200";
        data[3][3] = "-1";

        return data;
    }

    @Test(dataProvider = "negativeDataProvider")
    public void negativeTest(String result, String[] arr){
      Assert.assertNotEquals(result, Calculator.execute(arr));
    }


}
