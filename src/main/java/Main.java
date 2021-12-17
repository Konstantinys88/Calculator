import model.Calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String number1 = scanner.next();
        String operation = scanner.next();
        String number2 = scanner.next();

        Calculator.execute(number1, operation, number2);


    }
}
