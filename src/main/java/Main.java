import model.Calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите числа от 0 до 100 и операцию в формате число - операция - число (например 1 + 1). ");
        String operation = scanner.next();
        String number1 = scanner.next();
        String number2 = scanner.next();
        String[] arr = new String[]{number1,operation,number2};

        Calculator.execute(arr);


    }
}
