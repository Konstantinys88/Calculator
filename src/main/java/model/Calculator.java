package model;

public class Calculator {

    public static String execute(String[] params) {
        if (Double.parseDouble(params[1]) > 100 | Double.parseDouble(params[1]) < 0 |
                Double.parseDouble(params[2]) > 100 | Double.parseDouble(params[2]) < 0 ) {
            System.out.println("Error! Вы вышли за пределы допустимых значений");
            new CalculatorException();
            return "Error!";
        } else {
            double result = 0;
            switch (params[0]) {
                case ("+"):
                    result = Double.parseDouble(params[1]) + Double.parseDouble(params[2]);
                    break;
                case ("-"):
                    result = Double.parseDouble(params[1]) - Double.parseDouble(params[2]);
                    break;
                case ("*"):
                    result = Double.parseDouble(params[1]) * Double.parseDouble(params[2]);
                    break;
                case ("/"):
                    result = Double.parseDouble(params[1]) / Double.parseDouble(params[2]);
                    break;
                case ("%"):
                    result = Double.parseDouble(params[1]) % Double.parseDouble(params[2]);
                    break;
                case ("^"):
                    result = (int) Math.pow(Double.parseDouble(params[1]),Double.parseDouble(params[2]));
                    break;
                default:
                    new CalculatorException();
                    break;
            }
            System.out.println("Результат вычисления равен " + result);
            return (String.valueOf(result));
        }
    }


}



