package model;
public class Calculator {

    public static String execute(String [] params) {
        int result = 0;
            switch (params[0]){
            case ("+"): result = Integer.parseInt(params[1]) +  Integer.parseInt(params[2]);
                break;
            case ("-"): result = Integer.parseInt(params[1]) -  Integer.parseInt(params[2]);
                break;
            case ("*"): result = Integer.parseInt(params[1]) *  Integer.parseInt(params[2]);
                break;
            case ("/"): result = Integer.parseInt(params[1]) /  Integer.parseInt(params[2]);
                break;
            case ("%"): result = Integer.parseInt(params[1]) %  Integer.parseInt(params[2]);
                break;
            case ("^"): result = (int) Math.pow(Integer.parseInt(params[1]),Integer.parseInt(params[2]));
                break;
            default:
               new CalculatorException();
               break;
        }
        System.out.println("Результат вычисления равен " + result);
        return Integer.toString(result);
    }

}

