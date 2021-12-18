import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( " Введите операцию ( + , - , * , / ) и число от -100 до 100  формате " +
                "операция - число - число (например + 1 1). " );

        args = new String[3];
        args[0] = in.next();
        args[1] = in.next();
        args[2] = in.next();

        Calculator.execute(args);

    }
}
