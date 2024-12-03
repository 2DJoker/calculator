import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = input.next();

        int result;

        switch (operation) {
            case "+" -> {
                result = num1 + num2;
                System.out.println("Результат: " + result);
            }
            case "-" -> {
                result = num1 - num2;
                System.out.println("Результат: " + result);
            }
            case "*" -> {
                result = num1 * num2;
                System.out.println("Результат: " + result);
            }
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
            }
            default -> System.out.println("Ошибка: неверная операция!");
        }

        input.close();
    }
}
