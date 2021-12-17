import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public static Object[][] negativeDataProvider(){
        return new String[][]{
                {"+","1","4","8"},
                {"-","1","4","0"},
                {"*","1","4","16"},
                {"/","1","4","1"},
        };
    }

    @Test(dataProvider = "negativeDataProvider")
    public void negativeTest(String operator, String valueOne, String valueTwo,String result){
        Assert.assertEquals(result, Calculator.execute());
    }


}
