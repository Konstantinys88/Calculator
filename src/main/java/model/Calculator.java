package model;
public class Calculator {

    public static String execute(String valueOne, String operator,String valueTwo) {
        int result = 0;
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
        System.out.println("Результат вычисления равен " + result);
        return Integer.toString(result);
    }

}

