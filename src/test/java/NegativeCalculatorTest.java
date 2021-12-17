import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public static Object[][] negativeDataProvider(){
        return new String[][]{
                {"+","1","4",},
                {"-","1","4",},
                {"*","1","4",},
                {"/","1","4",},
        };
    }

    @Test(dataProvider = "negativeDataProvider")
    public void negativeTest(){
        //Assert.assertEquals(Calculator.execute());
    }


}
