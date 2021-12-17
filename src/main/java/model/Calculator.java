package model;

import java.util.Scanner;

public class Calculator {

    public static String execute(String[] param) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        String valueOne = scanner.next();
        String operator = scanner.next();
        String valueTwo = scanner.next();
        switch (operator){
            case ("+"): result = Integer.parseInt(valueOne) +  Integer.parseInt(valueTwo);
                break;
            case ("-"): result = Integer.parseInt(valueOne) -  Integer.parseInt(valueTwo);
                break;
            case ("*"): result = Integer.parseInt(valueOne) *  Integer.parseInt(valueTwo);
                break;
            case ("/"): result = Integer.parseInt(valueOne) /  Integer.parseInt(valueTwo);
                break;
            case ("%"): result = Integer.parseInt(valueOne) %  Integer.parseInt(valueTwo);
                break;
            case ("^"): result = (int) Math.pow(Integer.parseInt(valueOne),Integer.parseInt(valueTwo));
                break;
            default:
                System.out.println("Error!");
                break;
        }

        System.out.println("Результат вычисления равен");
        System.out.println(result);
        return null;
    }

}

