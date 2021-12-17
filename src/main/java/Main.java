import model.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа от -100 до 100 и операцию в формате число - операция - число (например 1 + 1). ");
        args = new String[3];
        args[1] = in.next();
        args[0] = in.next();
        args[2] = in.next();
        //String[] arrr = new String[]{number1,operation,number2};

        Calculator.execute(args);


    }
}
