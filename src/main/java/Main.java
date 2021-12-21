import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Данные в консоль нужно вводить в следующем порядке оператор число, число (+ 1 1).
         * Калькулятор принимает только числа от -100 до 100.
         */

        Scanner in = new Scanner(System.in);

        args = new String[3];

        args[0] = in.next();
        args[1] = in.next();
        args[2] = in.next();

        String result = Calculator.execute(args);
        System.out.println(result);

    }
}
