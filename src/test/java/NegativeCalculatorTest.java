import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public Object[][] negativeData() {
        return new Object[][]{
                {"1", "4", "4"},
                {"/", "21", "0"},
                {"-", "-2147483648", "2147483647"},
                {"+", "2147483647", "1"}};
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String op, String one, String two) {
        try {
            Calculator.execute(new String[]{op, one, two});
        } catch (CalculatorException e) {
            throw new CalculatorException();
        }
    }
}
