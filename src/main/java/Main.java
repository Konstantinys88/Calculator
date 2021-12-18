import model.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа от -100 до 100 и операцию в формате число - операция - число (например 1 + 1). ");
        String operation = in.next();
        String number1 = in.next();
        String number2 = in.next();
        String[] arr = new String[]{number1,operation,number2};

        Calculator.execute(arr);

    }
}
