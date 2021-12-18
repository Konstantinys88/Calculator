package model;

public class Calculator {

    public static String execute(String[] params) {
        if (Double.parseDouble(params[1]) > 100 | Double.parseDouble(params[1]) < -100 |
                Double.parseDouble(params[2]) > 100 | Double.parseDouble(params[2]) < -100 ) {
            System.out.println("Error! Вы вышли за пределы допустимых значений");
            throw new CalculatorException();
        } else {
            double result;
            char a = params[0].charAt(0);
            switch (a) {
                case ('+'):
                    result = Double.parseDouble(params[1]) + Double.parseDouble(params[2]);
                    break;
                case ('-'):
                    result = Double.parseDouble(params[1]) - Double.parseDouble(params[2]);
                    break;
                case ('*'):
                    result = Double.parseDouble(params[1]) * Double.parseDouble(params[2]);
                    break;
                case ('/'):
                    result = Double.parseDouble(params[1]) / Double.parseDouble(params[2]);
                    break;
                default:
                    throw new CalculatorException();

            }
            System.out.println("Результат вычисления равен " + result);
            return (String.valueOf(result));
        }
    }


}



