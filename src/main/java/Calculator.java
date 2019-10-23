import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String [] args) {
        float number1 = getNumbers();
        float number2 = getNumbers();
        String operation = getOperation();
        float result=calc(number1, number2, operation);
        System.out.println("Your result" + number1 + operation + number2 + "=" + result );
    }

    public static float getNumbers()//функция считывания чисел из консоли(метод видим и может быть вызван, метод связан с классом, и возвращает float)
    {
        Scanner sc = new Scanner(System.in);
        float number;
        System.out.println("\n" + "Enter the number:");
        if (sc.hasNextFloat()) {
            number = sc.nextFloat();
        }
        else {
            System.out.println("It is not a number");
            sc.next();
            number = getNumbers();
        }
        return number;
    }


    public static String getOperation()
    {
        Scanner sc = new Scanner(System.in);
        List<String> str1 = new ArrayList<String>();
        String operation;
        str1.add("+");
        str1.add("-");
        str1.add("/");
        str1.add("*");

        do {
            System.out.println("\n" +
                    "Enter operation:");
            while (!sc.hasNext()) {
                System.out.println("It is not an operation");
                sc.next();
                operation = getOperation();
            }
            operation = sc.next();
        } while (!str1.contains(operation));

        return operation;
    }

    public static float calc(float number1, float number2, String operation)
    {
        float result;
        switch (operation) {
            case ("+"):
                result = number1 + number2;
                break;
            case ("-"):
                result = number1 - number2;
                break;
            case ("*"):
                result = number1 * number2;
                break;
            case ("/"):
                result = number1 / number2;
                break;
            default:  System.out.println("Operation failed, try again");
                result = calc(number1, number2, operation);
        }

        return result;

    }

}

