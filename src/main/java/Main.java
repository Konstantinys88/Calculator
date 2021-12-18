import model.Calculator;
import model.CalculatorException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        args = new String[3];

        args[0] = in.next();
        args[1] = in.next();
        args[2] = in.next();

        String result = Calculator.execute(args);
        System.out.println(result);

    }
}
