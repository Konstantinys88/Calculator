
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public static Object[][] positiveDataProvider(){
        return new String[][]{
                {"+","4","4","8"},
                {"-","4","4","0"},
                {"*","4","4","16"},
                {"/","4","4","1"},
        };
    }

    @Test(dataProvider = "positiveDataProvider")
    public void positiveTest(String operator, String valueOne, String valueTwo,String result){
        Assert.assertEquals(result, Calculator.execute(operator,valueOne,valueTwo));
    }
}


